package bai5.model;

public class Person {
    private String fullName;
    private int age;
    private int phoneNumber;
    private String CMT;

    public Person(String fullName, int age, int phoneNumber, String CMT) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.CMT = CMT;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", CMT='" + CMT + '\'' +
                '}';
    }
}
