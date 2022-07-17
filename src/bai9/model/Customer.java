package bai9.model;

public class Customer {
    private String fullName;
    private int houseNumber;
    private int id;

    public Customer(String fullName, int houseNumber, int id) {
        this.fullName = fullName;
        this.houseNumber = houseNumber;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", houseNumber=" + houseNumber +
                ", id=" + id +
                '}';
    }
}
