package com.daniyar.shopping_task_2;

public class Order {
    private int orderID;
    private String customerName;
    private String orderDetails;

    public Order() {
    }

    public Order(int orderID, String customerName, String orderDetails) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerName='" + customerName + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
