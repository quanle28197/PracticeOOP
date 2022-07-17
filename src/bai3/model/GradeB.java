package bai3.model;

public class GradeB extends Student{
    public static final String  Math = "math";
    public static final String Chemistry = "chemistry";
    public static final String Biology = "biology";

    public GradeB(String id, String fullName, String address, int level, String Math, String Chemistry, String Biology) {
        super(id, fullName, address, level);
    }

    @Override
    public String toString() {
        return "GradeB{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", level=" + level +
                ", Subject: " + Math + "-" + Chemistry + "-" + Biology +
                '}';
    }
}
