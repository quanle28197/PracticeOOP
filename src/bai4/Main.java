package bai4;

import bai4.model.Family;
import bai4.model.Person;
import bai4.model.Town;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Town town = new Town();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Family family = new Family();
            System.out.println("Enter address: ");
            scanner.nextLine();
            String address = scanner.nextLine();
            System.out.println("Enter house number: " + (i + 1));
            System.out.println("Enter total number person in family");
            int s = new Scanner(System.in).nextInt();

            for (int j = 0; j < s; j++) {
                System.out.println("Enter fullName");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter age:");
                int age = new Scanner(System.in).nextInt();
                System.out.println("Enter job: ");
                String job = new Scanner(System.in).nextLine();
                System.out.println("Enter passport: ");
                String passport = new Scanner(System.in).nextLine();
                family.addPerson(new Person(name, age, job, passport));
            }
            town.addFamily(family);
        }

        System.out.println("The information of family in town");
        town.getFamilies().stream().forEach(System.out::println);

    }
}
