package bai5.view;

import bai5.controller.HotetManagement;
import bai5.model.Person;
import bai5.model.Room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotetManagement management = new HotetManagement();
        while (true) {
        menu(management);
        }
    }

    private static void menu(HotetManagement management) {
        System.out.println("------------------------------------------------------");
        System.out.println("-------Welcome to Hotel management system---------");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Add room");
        System.out.println("2. Room list");
        System.out.println("3. Available room");
        System.out.println("4: Order room");
        System.out.println("5: Delete order");
        System.out.println("6: Payment");
        System.out.println("7: Exit");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Kind of room");
                String room = new Scanner(System.in).nextLine();
                if (management.addRoom(room)) {
                    System.out.println("Create room success");
                }
                break;
            }
            case 2: {
                System.out.println("list of room types");
                System.out.println(management.getRooms());
                break;
            }
            case 3: {
                System.out.println("Room are available");
                System.out.println(management.getFreeroom());
                break;
            }
            case 4: {
                System.out.println("Enter the guest information");
                System.out.println("Enter the full name");
                String fullName = new Scanner(System.in).nextLine();
                System.out.println("Enter age: ");
                int age = new Scanner(System.in).nextInt();
                System.out.println("Enter phone number");
                int phoneNumber = new Scanner(System.in).nextInt();
                System.out.println("Enter passport");
                String CMT = new Scanner(System.in).nextLine();
                Person person = new Person(fullName, age, phoneNumber, CMT);

                System.out.println("Choose the room");
                int roomId = new Scanner(System.in).nextInt();
                Room room = management.getRooms().get(roomId - 1);

                System.out.println("Total day rent");
                int dayRent = new Scanner(System.in).nextInt();

                management.addOrder(dayRent, room, person);
                break;
            }
            case 5: {
                System.out.println("Do you want to cancel order. Please enter your passport: ");
                String CMT = new Scanner(System.in).nextLine();
                if (management.cancelOrder(CMT)) {
                    System.out.println("Your order has been cancel");
                } else {
                    System.out.println("Your CMT are invalid");
                }
            }
        }
    }
}
