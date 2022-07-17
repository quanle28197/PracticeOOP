package bai8.controller;

import bai8.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement {
    private List<Order> orders;

    public OrderManagement() {
        this.orders = new ArrayList<Order>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public boolean deleteCardById(int id) {
        Order order = orders.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
        if (order != null) {
            return orders.remove(order);
        }
        return false;
    }

    public void showListOrder() {
        orders.forEach(System.out::println);
    }
}
