package bai3.model;

public class Student {
    protected String id;
    protected String fullName;
    protected String address;
    protected int level;

    public Student(String id, String fullName, String address, int level) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
