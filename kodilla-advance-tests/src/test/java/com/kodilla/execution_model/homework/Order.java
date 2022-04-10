package com.kodilla.execution_model.homework;

public class Order {
    private String login;
    private double orderValue;
    private double orderData;

    public Order(String login, double orderValue, double orderData) {
        this.login = login;
        this.orderValue = orderValue;
        this.orderData = orderData;
    }
    public String getLogin() {
        return login;
    }
    public double getOrderValue() {
        return orderValue;
    }
    public double getOrderData() {
        return orderData;
    }
}
