package bai14.model;

import bai14.service.DateConverter;

import java.time.LocalDate;

public class GoodStudent extends Student {
    private double gpa;
    private String bestReward;

    public GoodStudent(String fullName, LocalDate birthday, String sex, String phoneNumber, String university, String gradeLevel, double gpa, String bestReward) {
        super(fullName, birthday, sex, phoneNumber, university, gradeLevel);
        this.gpa = gpa;
        this.bestReward = bestReward;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestReward() {
        return bestReward;
    }

    public void setBestReward(String bestReward) {
        this.bestReward = bestReward;
    }


    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestReward='" + bestReward + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + DateConverter.dateToString(birthday) +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", university='" + university + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
