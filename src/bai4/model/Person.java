package bai4.model;

public class Person {
    private String fullName;
    private int age;
    private String job;
    private String passport;

    public Person(String fullName, int age, String job, String passport) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.passport = passport;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
