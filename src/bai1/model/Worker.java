package bai1.model;

public class Worker extends Officer {
    private int levlel;

    public Worker(int levlel) {
        this.levlel = levlel;
    }

    public Worker(String name, int age, String gender, String address, int levlel) {
        super(name, age, gender, address);
        this.levlel = levlel;
    }

    public int getLevlel() {
        return levlel;
    }

    public void setLevle(int levlel) {
        this.levlel = levlel;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "levlel=" + levlel +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
