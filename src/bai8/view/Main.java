package bai8.view;

import bai8.controller.OrderManagement;
import bai8.model.Order;
import bai8.model.Student;

public class Main {
    public static void main(String[] args) {
        OrderManagement order = new OrderManagement();
        Order order1 = new Order(1,"20/08", "23/8", "Book1",
                new Student("Minh Quan", 20, "12A"));
        Order order2 = new Order(2,"21/08", "24/8", "Book1",
                new Student("Minh Quan", 20, "12A"));
        Order order3 = new Order(3,"22/08", "26/8", "Book1",
                new Student("Minh Quan", 20, "12A"));

        order.addOrder(order1);
        order.addOrder(order2);
        order.addOrder(order3);

        order.showListOrder();

        System.out.println("--------Delete Form------------");
        order.deleteCardById(2);
        order.showListOrder();
    }
}
