package bai9.model;

public class Receipt {
    private Customer customer;
    private int oldNumber;
    private int newNumber;

    public Receipt(Customer customer, int oldNumber, int newNumber) {
        this.customer = customer;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int getTotalMoney() {
        return (newNumber - oldNumber) * 5;
    }

    public void updateCustomer(String fullName, int houseNumber, int id) {
        this.setCustomer(new Customer(fullName, houseNumber, id));
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                '}';
    }
}
