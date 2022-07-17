package bai3.model;

public class GradeC extends Student{
    public static final String Literature = "literature";
    public static final String History = "history";
    public static final String Geography = "gegraphy";

    public GradeC(String id, String fullName, String address, int level, String Literature, String History, String Geography) {
        super(id, fullName, address, level);
    }

    @Override
    public String toString() {
        return "GradeC{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", level=" + level +
                ", Subject: " + Literature + "-" + History + "-" + Geography +
                '}';
    }
}
