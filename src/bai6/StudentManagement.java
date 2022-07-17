package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (students.stream().anyMatch(s -> s.getId() == (student.getId()))) {
            return false;
        }
        return students.add(student);
    }

    public List<Student> findStudentWithAge(int age) {
        return students.stream()
                .filter(s -> s.getAge() == age)
                .collect(Collectors.toList());
    }

    public long findStudentMatchValue(String country, int age) {
        return students.stream()
                .filter(s -> s.getAge() == age)
                .filter(s -> s.getCountry() == country)
                .count();
    }
}
