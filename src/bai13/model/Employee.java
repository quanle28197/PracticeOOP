package bai13.model;

import bai13.service.ulity.DateConverter;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    protected static int counter = 0;
    protected String id;
    protected String fullName;
    protected LocalDate dateOfBirth;
    protected String phoneNumber;
    protected String email;

    protected List<Certificate> certificates;

    public Employee(String id, String fullName, String dateOfBirth, String phoneNumber, String email, List<Certificate> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = DateConverter.stringToDate(dateOfBirth);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.certificates = certificates;
    }

    protected Employee() {
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showInfo();

    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }

    public boolean deleteCertificate(Certificate certificate) {
        return certificates.remove(certificate);
    }
}
