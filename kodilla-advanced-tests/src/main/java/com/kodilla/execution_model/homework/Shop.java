package com.kodilla.execution_model.homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();
    DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public void addOrder(double amount, String date, String login) {
        try {
            this.orders.add(new Order(amount,simpleDateFormat.parse(date),login));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Set<Order> getOrders(Date from, Date to) {
        return orders.stream().filter(order -> order.getDate().compareTo(from)>=0 && order.getDate().compareTo(to)<=0).collect(Collectors.toSet());
    }

    public Set<Order> getOrders(double amountFrom, double amountTo) {
        return orders.stream().filter(order -> order.getAmount() >= amountFrom && order.getAmount() <= amountTo).collect(Collectors.toSet());
    }

    public int orderCount() {
        return orders.size();
    }

    public double amountSum() {
        double amountSum = 0;
        for (Order order : orders) {
            amountSum += order.getAmount();
        }
        return amountSum;
    }
}