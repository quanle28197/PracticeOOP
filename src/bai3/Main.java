package bai3;

import bai3.model.Student;
import bai3.model.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("-------Welcome to document management system---------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Enter 1: To add Student");
            System.out.println("Enter 2: To show detail information");
            System.out.println("Enter 3: To find by id");
            System.out.println("Enter 4: To exit");
            String type = scanner.nextLine();
            switch (type) {
                case "1": {
                    System.out.println("Enter a: To add student grade A");
                    System.out.println("Enter b: To add student grade B");
                    System.out.println("Enter c: To add student grade C");
                    String input = scanner.nextLine();
                    switch (input) {
                        case "a": {
                            studentManagement.addStudent(createStudent(scanner, "a"));
                            break;
                        }
                        case "b": {
                            studentManagement.addStudent(createStudent(scanner,"b"));
                            break;
                        }
                        case "c": {
                            studentManagement.addStudent(createStudent(scanner,"c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid number");
                            break;
                    }
                    break;
                }
                case "2": {
                    studentManagement.showDetailInfo();
                    break;
                }
                case "3": {
                    System.out.println("Enter id: ");
                    String id = scanner.nextLine();
                    Student student = studentManagement.searchById(id);
                    if (student != null) {
                        System.out.println("Not found student");
                    } else {
                        System.out.println(student.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid input");
                    continue;
            }
        }
    }
    public static Student createStudent(Scanner scanner, String student) {
        System.out.println("Enter id");
        String id = scanner.nextLine();
        System.out.println("Enter full name");
        String fullName = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter level");
        int level = scanner.nextInt();
        scanner.nextLine();
        if (student.equals("a")) {
            return new Student(id, fullName, address, level);
        } else if (student.equals("b")) {
            return new Student(id, fullName, address, level);
        } else {
            return new Student(id, fullName, address, level);
        }
    }
}
