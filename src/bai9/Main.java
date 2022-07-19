package bai9;

import bai9.model.Customer;
import bai9.model.Receipt;

public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer("Minh Quan", 10, 1);
       Customer customer2 = new Customer("Thuy Tien", 11, 2);

       Receipt receipt = new Receipt(customer1, 300, 100);
       Receipt receipt2 = new Receipt(customer2, 500, 200);

        System.out.println(receipt);
        System.out.println(receipt2);

        System.out.println("--------Update new customer---------");
        receipt.updateCustomer("Minh Hieu", 20, 3);
        System.out.println(receipt);
        System.out.println("New receipt is " + receipt);

    }
}
