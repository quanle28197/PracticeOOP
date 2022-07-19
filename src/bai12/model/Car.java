package bai12.model;

public class Car extends Vehicle {
    private int seatNumber;

    private String engineType;


    public Car(int id, String manufacturer, int price, String color, int seatNumber, String engineType) {
        super(id, manufacturer, price, color);
        this.seatNumber = seatNumber;
        this.engineType = engineType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seatNumber=" + seatNumber +
                ", engineType='" + engineType + '\'' +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
