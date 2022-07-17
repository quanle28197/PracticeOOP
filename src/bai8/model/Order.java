package bai8.model;

public class Order {
    private int id;
    private String borrowedDate;
    private String deadLine;
    private String bookCode;
    private Student student;

    public Order(int id, String borrowedDate, String deadLine, String bookCode, Student student) {
        this.id = id;
        this.borrowedDate = borrowedDate;
        this.deadLine = deadLine;
        this.bookCode = bookCode;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", borrowedDate='" + borrowedDate + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", student=" + student +
                '}';
    }
}
