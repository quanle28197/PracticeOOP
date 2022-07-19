package bai14.model;

import bai14.service.DateConverter;

import java.time.LocalDate;

public class NormalStudent extends Student {
    private Integer englishScore;
    private double entryScore;

    public NormalStudent(String fullName, LocalDate birthday, String sex, String phoneNumber, String university, String gradeLevel, Integer englishScore, double entryScore) {
        super(fullName, birthday, sex, phoneNumber, university, gradeLevel);
        this.englishScore = englishScore;
        this.entryScore = entryScore;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryScore() {
        return entryScore;
    }

    public void setEntryScore(double entryScore) {
        this.entryScore = entryScore;
    }


    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryScore=" + entryScore +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + DateConverter.dateToString(birthday) +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", university='" + university + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
