package bai2.model;

public class Document {
    protected String id;
    protected String publishingCompany;
    protected int numberRelease;

    public Document() {

    }

    public Document(String id, String publishingCompany, int numberRelease) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.numberRelease = numberRelease;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }
}
