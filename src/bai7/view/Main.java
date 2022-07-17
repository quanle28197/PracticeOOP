package bai7.view;

import bai7.controller.TeacherManagement;
import bai7.model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherManagement management = new TeacherManagement();
        Teacher teacher1 = new Teacher("Minh Quan", 26, "Viet Nam", 1, 500, 160 , 100 );
        Teacher teacher2 = new Teacher("Minh Hieu", 21, "Viet Nam", 2, 200, 160 , 100 );
        Teacher teacher3 = new Teacher("Minh Duc", 20, "Viet Nam", 3, 500, 160 , 100 );
        Teacher teacher4 = new Teacher("Minh Hoang", 19, "Viet Nam", 4, 800, 160 , 100 );

        management.addTeacher(teacher1);
        management.addTeacher(teacher2);
        management.addTeacher(teacher3);
        management.addTeacher(teacher4);

        System.out.println(management.getTeachers());

        System.out.println(management.removeTeacherById(2));
        System.out.println(management.getTeachers());

        management.getSalaryById(1);
    }
}
