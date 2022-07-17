package bai7.controller;

import bai7.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
    private List<Teacher> teachers;


    public TeacherManagement() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean removeTeacherById(int id) {
        Teacher teacher = teachers.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher != null) {
            return teachers.remove(teacher);
        }
        return false;
    }

    public void getSalaryById(int id) {
        Teacher teacher = teachers.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher != null) {
            System.out.println(teacher.getRealSalary());
        } else {
            System.out.println("ID not found");
        }
    }

}
