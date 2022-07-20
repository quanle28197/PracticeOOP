package bai14.controller;

import bai14.model.GoodStudent;
import bai14.model.NormalStudent;
import bai14.model.Student;
import bai14.service.InputValidator;
import bai14.service.exception.InvalidDOBException;
import bai14.service.exception.InvalidFullNameException;
import bai14.service.exception.InvalidInputException;
import bai14.service.exception.InvalidPhoneNumberException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RecruitmentManagement {
    private StudentManagement management;
    private int n;

    public RecruitmentManagement() {
        this.management = new StudentManagement();
    }

    public StudentManagement getManagement() {
        return management;
    }

    public RecruitmentManagement(StudentManagement management) {
        this.management = management;
    }

    public void menu() {
        System.out.println("------------------------------------------------------");
        System.out.println("-------Welcome to document management system---------");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Number of students to recruit");
        System.out.println("2. Add student");
        System.out.println("3. Show students info");
        System.out.println("4. Show candidates");
        System.out.println("5. Exit");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Number of students to recruit");
                int s = new Scanner(System.in).nextInt();
                try {
                    InputValidator.numberOfRecruimentCheck(s);
                } catch (InvalidInputException e) {
                    e.printStackTrace();
                }
                n = s;
                break;
            }
            case 2: {
                insertStudent();
                break;
            }
            case 3 : {
                System.out.println("Show student information");
                management.showNameAndPhoneNumber();
                break;
            }
            case 4: {
                System.out.println("Show candidates");
                showCandidates();
                break;
            }
            case 5: {
                System.out.println("Good bye");
                System.exit(0);
            }
            default: {
                System.err.println("Wrong input");
                break;
            }
        }
    }

    private void insertStudent() {
        System.out.println("Type of student: ");
        System.out.println("a: Good student");
        System.out.println("b: Normal student");
        Student student = null;
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        if (t.equals("a")) {
            try {
                student = createGoodStudent(scanner);
            }
            catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException e) {
                e.printStackTrace();
                insertStudent();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (t.equals("b")) {
            try {
                student = createNormalStudent(scanner);
            }
            catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException e) {
                e.printStackTrace();
                insertStudent();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.err.println("Invalid input");
            management.addStudent(student);
        }
    }

    private void showCandidates() {
        List<Student> candidates = new ArrayList<>();
        List<Student> goodStudents = management.goodStudentList();
        List<Student> normalStudents = management.normalStudentList();
        if (goodStudents.size() >= n) {
            candidates.addAll(goodStudents.stream()
                    .map(s -> (GoodStudent) s)
                    .sorted(Comparator.comparing(GoodStudent::getGpa).reversed()
                            .thenComparing(GoodStudent::getFullName))
                    .limit(n)
                    .collect(Collectors.toList())
            );
        }
        else {
            candidates.addAll(goodStudents);
            candidates.addAll(
                    normalStudents.stream()
                            .map(s -> (NormalStudent) s)
                            .sorted(Comparator.comparing(NormalStudent::getEntryScore).reversed()
                                    .thenComparing(NormalStudent::getEnglishScore).reversed()
                                    .thenComparing(NormalStudent::getFullName))
                            .limit(n - goodStudents.size())
                            .collect(Collectors.toList())
            );
        }
        candidates.forEach(Student::showInfo);
    }

    private Student createNormalStudent(Scanner scanner) {
        System.out.println("Adding normal student");
        System.out.println("Full name: ");
        String name = scanner.nextLine();
        InputValidator.nameCheck(name);
        System.out.println("Date of birth (dd/MM/yyyy)");
        String dobStr = scanner.nextLine();
        LocalDate dob = InputValidator.dobCheck(dobStr);
        System.out.println("Enter gender: ");
        String sex = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        InputValidator.phoneNumber(phone);
        System.out.println("University: ");
        String university = scanner.nextLine();
        System.out.println("Grade level: ");
        String gradeLevel = scanner.nextLine();
        System.out.println("English score");
        Integer engScore = new Scanner(System.in).nextInt();
        System.out.println("Entry test score: ");
        Double entryScore = new Scanner(System.in).nextDouble();
        return new NormalStudent(name, dob, sex, phone, university, gradeLevel, engScore, entryScore);
    }

    private Student createGoodStudent(Scanner scanner) {
        System.out.println("Adding good student");
        System.out.println("Full name: ");
        String name = scanner.nextLine();
        InputValidator.nameCheck(name);
        System.out.println("Date of birth (dd/MM/yyyy)");
        String dobStr = scanner.nextLine();
        LocalDate dob = InputValidator.dobCheck(dobStr);
        System.out.println("Enter gender: ");
        String sex = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        InputValidator.phoneNumber(phone);
        System.out.println("University: ");
        String university = scanner.nextLine();
        System.out.println("Grade level: ");
        String gradeLevel = scanner.nextLine();
        System.out.println("Gpa: ");
        Double gpa = new Scanner(System.in).nextDouble();
        System.out.println("Best reward name: ");
        String bestReward = scanner.nextLine();
        return new GoodStudent(name, dob, sex, phone, university, gradeLevel, gpa, bestReward);
    }
}
