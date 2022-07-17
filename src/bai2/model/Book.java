package bai2.model;

public class Book extends Document{
    private String name;
    private int pageNumber;

    public Book(String id, String publishingCompany, int numberRelease, String name, int pageNumber) {
        super(id, publishingCompany, numberRelease);
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", id=" + id +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
}
