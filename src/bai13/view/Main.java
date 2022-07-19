package bai13.view;

import bai13.controller.AppManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppManagement management = new AppManagement();

        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("-------Welcome to document management system---------");
            System.out.println("-------------------------------------------------------");
            System.out.println("1. Add new employee");
            System.out.println("2. Update employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Show information detail");
            System.out.println("5. Find by id");
            System.out.println("6. Exit");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1: {
                    management.insertEmployeeByType();
                    break;
                }
                case 2: {
                    management.update();
                    break;
                }
                case 3: {
                    management.delete();
                }
                case 4: {
                    management.showAll();
                }
                case 5: {
                    System.out.println("Find by Id");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println(management.findByIdApp(id));
                    break;
                }
                case 6: {
                    System.out.println("Thank you");
                    return;
                }
                default: {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }
}
