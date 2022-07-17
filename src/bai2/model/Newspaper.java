package bai2.model;

public class Newspaper extends Document{
    private int publishingDate;

    public Newspaper(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    public Newspaper(String id, String publishingCompany, int numberRelease, int publishingDate) {
        super(id, publishingCompany, numberRelease);
        this.publishingDate = publishingDate;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publishingDate=" + publishingDate +
                ", id=" + id +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
}
