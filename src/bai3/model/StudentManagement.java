package bai3.model;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
     List<Student> students;

     public StudentManagement() {
         this.students = new ArrayList<>();
     }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void showDetailInfo() {
         this.students.forEach(student -> System.out.println(student.toString()));
    }

    public Student searchById(String id) {
         return this.students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
}
