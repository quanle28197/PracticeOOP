package bai2.model;

public class Megazine extends Document{
    private int publishingNumber;
    private int publishingMonth;

    public Megazine(int publishingNumber, int publishingMonth) {
        this.publishingNumber = publishingNumber;
        this.publishingMonth = publishingMonth;
    }

    public Megazine(String id, String publishingCompany, int numberRelease, int publishingNumber, int publishingMonth) {
        super(id, publishingCompany, numberRelease);
        this.publishingNumber = publishingNumber;
        this.publishingMonth = publishingMonth;
    }

    public int getPublishingNumber() {
        return publishingNumber;
    }

    public void setPublishingNumber(int publishingNumber) {
        this.publishingNumber = publishingNumber;
    }

    public int getPublishingMonth() {
        return publishingMonth;
    }

    public void setPublishingMonth(int publishingMonth) {
        this.publishingMonth = publishingMonth;
    }

    @Override
    public String toString() {
        return "Megazine{" +
                "publishingNumber=" + publishingNumber +
                ", publishingMonth=" + publishingMonth +
                ", id=" + id +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
}
