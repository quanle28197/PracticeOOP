package bai12.model;

public class Truck extends Vehicle {
    private String payload;

    public Truck(int id, String manufacturer, int price, String color, String payload) {
        super(id, manufacturer, price, color);
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload='" + payload + '\'' +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
