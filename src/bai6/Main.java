package bai6;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student(1, "Minh Quan", 24, "HN");
        Student student2 = new Student(2, "Duc Trung", 22, "DN");
        Student student3 = new Student(3, "Minh Hieu", 23, "DN");
        Student student4 = new Student(4, "Minh Ngoc", 20, "HP");
        Student student5 = new Student(5, "Luong Hieu", 24, "SG");

        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        studentManagement.addStudent(student4);
        studentManagement.addStudent(student5);

        System.out.println(studentManagement.findStudentWithAge(22));
        System.out.println(studentManagement.findStudentMatchValue("DN", 23));
        }
    }
