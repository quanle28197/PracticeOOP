package bai13.controller;

import bai13.model.Employee;
import bai13.model.Experience;
import bai13.model.Fresher;
import bai13.model.Intern;
import bai13.service.exception.*;
import bai13.service.ulity.ScannerFactory;
import bai13.service.ulity.Validator;

import java.util.Scanner;

public class AppManagement {
    private EmployeeManagement employeeManagement;

    public AppManagement() {
        this.employeeManagement = new EmployeeManagement();
    }

    public void insertEmployeeByType() {
        System.out.println("Enter 1: To create Experience");
        System.out.println("Enter 2: To create Fresher");
        System.out.println("Enter 3 : To create intern");
        int type = new Scanner(System.in).nextInt();
        Employee employee = null;
        if (type == 1) {
            employee = this.createExperience();
        }
        if (type == 2) {
            employee = this.createFresher();
        }
        if (type == 3) {
            employee = this.createIntern();
        }
        try {
            checkData(employee);
        }catch (PhoneException | FullNameException | EmailException | BirthdayException e) {
            e.printStackTrace();
            insertEmployeeByType();
        }
        employeeManagement.addEmployee(employee);
        System.out.println("Insert successfully");
    }

    public void showAll() {
        employeeManagement.getEmployeesList()
                .forEach(System.out::println);
    }

    public Employee findByIdApp(String id) {
        Employee employee = null;
        try {
            employee = employeeManagement.findEmployeeById(id);
        } catch (IdNotFoundException e) {
            System.out.println(e);
        }
        return employee;
    }

    public void update() {
        System.out.println("Enter id to update");
        String id = new Scanner(System.in).nextLine();
        Employee employee = this.findByIdApp(id);
        if (employee != null) {
            if (employee instanceof Experience) {
                employee = this.createExperience();
            }
            if (employee instanceof  Fresher) {
                employee = this.createFresher();
            }
            if (employee instanceof  Intern) {
                employee = this.createIntern();
            }
            try {
                checkData(employee);
            } catch (PhoneException | BirthdayException | EmailException | FullNameException e) {
                e.printStackTrace();
                update();
            }
            employeeManagement.addEmployee(employee);
        }
    }

    public boolean delete() {
        Scanner s = ScannerFactory.getScanner();
        System.out.println("Enter id your want to delete");
        String id = s.nextLine();
        return employeeManagement.removeById(id);
    }

    private void checkData(Employee employee)
        throws PhoneException, BirthdayException, EmailException, FullNameException {
            Validator.nameCheck(employee.getFullName());
            Validator.birthdayCheck(employee.getDateOfBirth());
            Validator.phoneCheck(employee.getPhoneNumber());
            Validator.emailCheck(employee.getEmail());
        }

    private Employee basicInfo() {
        Scanner s = ScannerFactory.getScanner();
        System.out.println("Enter id: ");
        String id = s.nextLine();
        System.out.println("Enter full name: ");
        String fullName = s.nextLine();
        System.out.println("Birthday (dd/MM/yyyy):");
        String birthday = s.nextLine();
        System.out.println("Enter phone number: ");
        String phone = s.nextLine();
        System.out.println("Enter email: ");
        String email = s.nextLine();

        return new Employee(id, fullName, birthday, phone, email, null) {
            @Override
            public void showInfo() {

            }
        };
    }

    private Employee createExperience() {
        Scanner n = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Exp in year: ");
        int expInYear = new Scanner(System.in).nextInt();
        System.out.println("Pro skill: ");
        String proSkills = n.nextLine();
        return new Experience(basicInfo, expInYear, proSkills);
    }

    private Employee createFresher() {
        Scanner n = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Graduation Date: ");
        String gradDate = n.nextLine();
        System.out.println("Graduation Rank:  ");
        String gradRankRank = n.nextLine();
        System.out.println("University: ");
        String university = n.nextLine();
        return new Fresher(basicInfo, gradDate,gradRankRank, university);
    }

    private Employee createIntern() {
        Scanner n = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Enter major: ");
        String major = n.nextLine();
        System.out.println("Enter semester: ");
        String semester = n.nextLine();
        System.out.println("Enter University: ");
        String university = n.nextLine();
        return new Intern(basicInfo, major, semester, university);
    }
}
