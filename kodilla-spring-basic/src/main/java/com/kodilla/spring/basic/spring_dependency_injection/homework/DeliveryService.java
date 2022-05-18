package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public abstract class DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }

    public abstract boolean deliveryPackage(String address, double weight);
}