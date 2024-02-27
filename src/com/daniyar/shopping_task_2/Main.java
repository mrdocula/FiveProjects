package com.daniyar.shopping_task_2;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(21, "Chair", "delivery next week");
        Order order2 = new Order(52, "Printer", "take out");
        Order order3 = new Order(12, "Bread", "with seeds");
        Order order4 = new Order(45, "Eggs", "white eggs, high quality");

        Shop shop = new Shop();
        shop.addOneOrder(order1);
        shop.addOneOrder(order2);
        shop.addOneOrder(order3);
        shop.addOneOrder(order4);

        shop.extractNextFirstOrder();

        shop.removeOneOrder("Bread");

        shop.printQueueAllOrders();

        System.out.println(shop.findTheOneOrder("Printer"));

    }
}
