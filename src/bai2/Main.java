package bai2;


import bai2.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        System.out.println("------------------------------------------------------");
        System.out.println("-------Welcome to document management system---------");
        System.out.println("-------------------------------------------------------");
        while (true) {
            System.out.println("Enter 1: To add new document");
            System.out.println("Enetr 2: To show document detail");
            System.out.println("Enter 3: To search document");
            System.out.println("Enter 4: To delete document by id");
            System.out.println("Enter 5: To exit");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: To add book");
                    System.out.println("Enter b: To add newspaper");
                    System.out.println("Enter c: To add megazine");
                    String input = scanner.nextLine();
                    switch (input) {
                        case "a": {
                            System.out.println("Enter id");
                            String id = scanner.nextLine();
                            System.out.println("Enter publishing company");
                            scanner.nextLine();
                            String publishingCompany = scanner.nextLine();
                            System.out.println("Enter number release");
                            int numberRelease = scanner.nextInt();
                            System.out.println("Enter name");
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            System.out.println("Enter page number");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, publishingCompany, numberRelease, name, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Enter id");
                            String id = scanner.nextLine();
                            System.out.println("Enter publishing company");
                            String publishingCompany = scanner.nextLine();
                            System.out.println("Enter number release");
                            int numberRelease = scanner.nextInt();
                            System.out.println("Enter publishing date");
                            int publishingDate = scanner.nextInt();
                            Document newspaper = new Newspaper(id, publishingCompany, numberRelease, publishingDate);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter id");
                            String id = scanner.nextLine();
                            System.out.println("Enter publishing company");
                            scanner.nextLine();
                            String publishingCompany = scanner.nextLine();
                            System.out.println("Enter number release");
                            int numberRelease = scanner.nextInt();
                            System.out.println("Enter publishing number");
                            int publishingNumber = scanner.nextInt();
                            System.out.println("Enter publishing month");
                            int publishingMonth = scanner.nextInt();
                            Document megazine = new Megazine(id, publishingCompany, numberRelease, publishingNumber, publishingMonth);
                            managerDocument.addDocument(megazine);
                            System.out.println(megazine.toString());
                        }
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerDocument.showDetail();
                    break;
                }
                case "3": {
                    System.out.println("Enter a: to search by book");
                    System.out.println("Enter b : to search by newspaper");
                    System.out.println("Enter c: to seach by megazine");
                    String input = scanner.nextLine();
                    switch (input) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.seachByNewsPaper();
                            break;
                        }
                        case "c": {
                            managerDocument.searchByMegazine();
                            break;
                        }
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;
                }
                case "4": {
                    System.out.println("Enter id to remove");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid input");
                    continue;
            }
        }
    }
}
