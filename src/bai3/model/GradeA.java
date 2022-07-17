package bai3.model;

public class GradeA extends Student{
    public static final String Math = "Toan";
    public static final String Physics = "Ly";
    public static final String Chemistry = "Hoa";

    public GradeA(String id, String fullName, String address, int level, String Math, String Physics, String Chemistry) {
        super(id, fullName, address, level);
    }

    @Override
    public String toString() {
        return "GradeA{" +
                " id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", level=" + level +
                ", Subject: " + Math + "-" + Physics + "-" + Chemistry +
                '}';
    }
}
