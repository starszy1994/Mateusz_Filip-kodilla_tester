package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    LocalDate current = LocalDate.now();
    LocalDate twoYearsAgo = current.minusYears(2);
    int max = 0;
    int min = 10000;

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public Order twoBetweenDate(LocalDate current, LocalDate twoYearsAgo) {
        if (current.isBefore(twoYearsAgo)){
    }
        return null;
    }
    public void getMaxValue() {
        int a = 0;
        if (a < min) {
            a = min;
        }
        return;
    }
    public void getMinValue() {
        int a = 0;
        if (a > max) {
            a = max;
        }
        return;
    }
    public double sum() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getOrderValue();
        }
        return sum;
    }
}
