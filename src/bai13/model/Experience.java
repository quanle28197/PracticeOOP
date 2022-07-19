package bai13.model;

import bai13.service.ulity.DateConverter;

import java.util.List;

public class Experience extends Employee {
    private int expYear;
    private String proSkill;

    public Experience() {
        ++counter;
    }

    public Experience(String id, String fullName, String dateOfBirth, String phoneNumber, String email, List<Certificate> certificates, int expYear, String proSkill) {
        super(id, fullName, dateOfBirth, phoneNumber, email, certificates);
        this.expYear = expYear;
        this.proSkill = proSkill;
        ++counter;
    }

    public Experience(Employee basicInfo, int expYear, String proSkill) {
        this.id = basicInfo.getId();
        this.fullName = basicInfo.getFullName();
        this.dateOfBirth = basicInfo.getDateOfBirth();
        this.phoneNumber = basicInfo.getPhoneNumber();
        this.email = basicInfo.getEmail();
        this.certificates = basicInfo.getCertificates();
        this.expYear = expYear;
        this.proSkill = proSkill;
        ++counter;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expYear=" + expYear +
                ", proSkill='" + proSkill + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + DateConverter.dateToString(dateOfBirth) +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                '}';
    }
}
