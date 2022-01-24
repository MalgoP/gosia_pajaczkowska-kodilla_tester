package com.kodilla.execution_model.homework;

import java.util.Date;
import java.util.Objects;

public class Order {
    private double amount;
    private Date date;
    private String login;

    public Order(double amount, Date date, String login) {
        this.amount = amount;
        this.date = date;
        this.login = login;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.amount, amount) == 0 && date.equals(order.date) && login.equals(order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, date, login);
    }
}