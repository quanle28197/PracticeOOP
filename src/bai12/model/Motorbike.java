package bai12.model;

public class Motorbike extends Vehicle {
    private String production;

    public Motorbike(int id, String manufacturer, int price, String color, String production) {
        super(id, manufacturer, price, color);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "production='" + production + '\'' +
                ", id='" + id + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
