package bai13.model;

import java.time.LocalDate;

public class Certificate {
    private int id;
    private String CertificateName;
    private String CertificateRank;
    private LocalDate CertificatedDate;

    public Certificate(int id, String certificateName, String certificateRank, LocalDate certificatedDate) {
        this.id = id;
        CertificateName = certificateName;
        CertificateRank = certificateRank;
        CertificatedDate = certificatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public LocalDate getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(LocalDate certificatedDate) {
        CertificatedDate = certificatedDate;
    }
}
