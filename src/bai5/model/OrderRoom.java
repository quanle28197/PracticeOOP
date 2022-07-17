package bai5.model;

public class OrderRoom {

    private int numberRentDay;
    private Room room;
    private Person person;

    public OrderRoom(int numberRentDay, Room room, Person person) {
        this.numberRentDay = numberRentDay;
        this.room = room;
        this.person = person;
    }

    public int getNumberRentDay() {
        return numberRentDay;
    }

    public void setNumberRentDay(int numberRentDay) {
        this.numberRentDay = numberRentDay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "OrderRoom{" +
                "numberRentDay=" + numberRentDay +
                ", room=" + room +
                ", person=" + person +
                '}';
    }
}
