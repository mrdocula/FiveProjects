package com.daniyar.shopping_task_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
//2. Разработай систему обработки заказов в интернет-магазине.
// Создайте класс Order с полями orderID, customerName и orderDetails.
// Создай класс Shop и используй Queue, чтобы хранить заказы.
// Реализуй методы для добавления заказа в очередь, обработки заказов
// (извлечения заказа из очереди) и вывода информации о следующем заказе в очереди.

public class Shop {
    private Queue<Order> queue;
    private Order order;

    public Shop() {
        this.queue = new LinkedList<>();
        this.order = new Order();
    }

    public void addOneOrder(Order orderToAdd) {
        queue.add(orderToAdd);
        System.out.println("The order ID: " + orderToAdd.getOrderID() + " was added.");
    }

    public void extractNextFirstOrder(){

        if (!queue.isEmpty()){
            System.out.println("First order in queue: " + queue.peek());
        }else{
        System.out.println("Queue is empty!!!");
        }
    }

    public void printQueueAllOrders() {
        Iterator iterator=queue.iterator();

        if(!queue.isEmpty()){
            System.out.println("THE QUEUE ALL ORDERS: ");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }else{
            System.out.println("Queue is empty!!");
        }
    }

    public void removeOneOrder(String name){
        Iterator<Order> iter = queue.iterator();
        while (iter.hasNext()) {
            if (iter.next().getCustomerName().equals(name))
            iter.remove();
        }
    }

    public boolean findTheOneOrder(String name){
        Iterator<Order> iter = queue.iterator();
        while (iter.hasNext()) {
            if (iter.next().getCustomerName().equals(name))
                return true;
        }
        return false;
    }

}
