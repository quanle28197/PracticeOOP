package bai5.controller;

import bai5.model.OrderRoom;
import bai5.model.Person;
import bai5.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotetManagement {
    private List<Room> rooms;
    private List<OrderRoom> orderRooms;

    public HotetManagement() {
        this.rooms = new ArrayList<>();
        this.orderRooms = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<OrderRoom> getOrderRooms() {
        return orderRooms;
    }

    public void setOrderRooms(List<OrderRoom> orderRooms) {
        this.orderRooms = orderRooms;
    }

    public boolean addRoom(String type) {
        switch (type) {
            case "A": {
                rooms.add(new Room("A", 500));
                break;
            }
            case "B": {
                rooms.add(new Room("B", 300));
                break;
            }
            case "C": {
                rooms.add(new Room("C", 100));
                break;
            }
            default:
                System.out.println("No room to add" + type);
                return false;
        }
        return true;
    }

    public void addOrder(int numberRentDay, Room room, Person person) {
        boolean check = orderRooms.stream().anyMatch(o -> o.getRoom().equals(room));
        if (check == true) {
            System.out.println("The room has been rent");
            return;
        }
        orderRooms.add(new OrderRoom(numberRentDay, room, person));
        System.out.println("Rent the room success");
    }

    public List<Room> getFreeroom() {
        List<Room> orderRoom = orderRooms.stream()
                .map(OrderRoom::getRoom)
                .collect(Collectors.toList());

        List<Room> freeroom = new ArrayList<>(rooms);
        freeroom.removeAll(orderRoom);
        return freeroom;
    }

    public boolean cancelOrder(String id) {
        OrderRoom orderRoom = orderRooms.stream()
                .filter(o -> o.getPerson().getCMT().equals(id))
                .findFirst()
                .orElse(null);
        return orderRooms.remove(orderRoom);
    }
}
