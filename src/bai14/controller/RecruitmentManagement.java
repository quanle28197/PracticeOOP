package bai14.controller;

import java.util.Scanner;

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

            }
        }
    }
}
