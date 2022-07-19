package bai13.model;

import bai13.service.ulity.DateConverter;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {
    private LocalDate graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
        ++counter;
    }

    public Fresher(String id, String fullName, String dateOfBirth, String phoneNumber, String email, List<Certificate> certificates, String graduationDate, String graduationRank, String education) {
        super(id, fullName, dateOfBirth, phoneNumber, email, certificates);
        this.graduationDate = DateConverter.stringToDate(graduationDate);
        this.graduationRank = graduationRank;
        this.education = education;
        ++counter;
    }

    public Fresher(Employee basicInfo, String graduationDate, String graduationRank, String education) {
        this.id = basicInfo.getId();
        this.fullName = basicInfo.getFullName();
        this.dateOfBirth = basicInfo.getDateOfBirth();
        this.phoneNumber = basicInfo.getPhoneNumber();
        this.email = basicInfo.getEmail();
        this.certificates = basicInfo.getCertificates();
        this.graduationDate = DateConverter.stringToDate(graduationDate);
        this.graduationRank = graduationRank;
        this.education = education;
        ++counter;
    }


    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate=" + DateConverter.dateToString(graduationDate) +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + DateConverter.dateToString(dateOfBirth) +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
