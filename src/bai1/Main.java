package bai1;

import bai1.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        System.out.println("----------------------");
        System.out.println("-------Welcome to our system---------");
        System.out.println("----------------------");

        while (true) {
            System.out.println("Enter 1: To add new officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To show detail officer");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: To insert Engineer ");
                    System.out.println("Enter b: To insert Staff ");
                    System.out.println("Enter c: To insert Worker ");
                    String input = scanner.nextLine();
                    switch (input) {
                        case "a": {
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter age");
                            int age = scanner.nextInt();
                            System.out.println("Enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("Enter address");
                            String address = scanner.nextLine();
                            System.out.println("Enter branch:");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addNewOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter age");
                            int age = scanner.nextInt();
                            System.out.println("Enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("Enter address");
                            String address = scanner.nextLine();
                            System.out.println("Enter work:");
                            String work = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, work);
                            managerOfficer.addNewOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter name");
                            String name = scanner.nextLine();
                            System.out.println("Enter age");
                            int age = scanner.nextInt();
                            System.out.println("Enter gender");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.println("Enter address");
                            String address = scanner.nextLine();
                            System.out.println("Enter level:");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addNewOfficer(worker);
                            System.out.println(worker.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter name to search");
                    String name = scanner.nextLine();
                    managerOfficer.searchByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListOfficer();
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

