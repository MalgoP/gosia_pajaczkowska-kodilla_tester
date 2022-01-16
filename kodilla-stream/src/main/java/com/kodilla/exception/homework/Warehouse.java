package com.kodilla.exception.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> result = orders.stream().filter(order -> order.getNumber().equals(number)).collect(Collectors.toList());
        if (result.size() == 0) {
            throw new OrderDoesntExistException();
        } else {
            return result.get(0);
        }
    }
}
