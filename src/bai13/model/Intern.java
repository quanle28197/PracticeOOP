package bai13.model;

import bai13.service.ulity.DateConverter;

import java.util.List;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
        ++counter;
    }

    public Intern(String id, String fullName, String dateOfBirth, String phoneNumber, String email, List<Certificate> certificates, String majors, String semester, String universityName) {
        super(id, fullName, dateOfBirth, phoneNumber, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(Employee basicInfo, String majors, String semester, String universityName) {
        this.id = basicInfo.getId();
        this.fullName = basicInfo.getFullName();
        this.dateOfBirth = basicInfo.getDateOfBirth();
        this.phoneNumber = basicInfo.getPhoneNumber();
        this.email = basicInfo.getEmail();
        this.certificates = basicInfo.getCertificates();
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        ++counter;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

     @Override
    public void showInfo() {
         System.out.println(this);
     }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + DateConverter.dateToString(dateOfBirth) +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
