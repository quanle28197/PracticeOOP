package bai14.view;

import bai14.controller.RecruitmentManagement;

public class Main {
    public static void main(String[] args) {
        RecruitmentManagement management = new RecruitmentManagement();
        while (true) {
            management.menu();
        }
    }
}
