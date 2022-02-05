package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Shop shop = new Shop();

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(200.0, "2022-01-01", "login1");
        shop.addOrder(1600.0, "2022-01-11", "login2");
        shop.addOrder(400.0, "2022-01-21", "login3");
        shop.addOrder(500.0, "2022-01-22", "login4");
    }

    @Test
    public void emptyShop() {
        Shop emptyShop = new Shop();
        assertEquals(0, emptyShop.orderCount());
        assertEquals(0.0, emptyShop.amountSum());
        Set<Order> chosenTwoDates = null;
        try {
            chosenTwoDates = emptyShop.getOrders(simpleDateFormat.parse("2021-12-01"), simpleDateFormat.parse("2022-01-11"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(0, chosenTwoDates.size());
    }

    @Test
    public void shouldAddAmounts() {
        int currentSize = shop.orderCount();
        shop.addOrder(50.0, "2022-01-23", "login6");
        assertEquals(currentSize + 1, shop.orderCount());
    }

    @Test
    public void shouldReturnTwoOrdersForChooseDates() throws Exception {
        Set<Order> ordersBetweenDates = null;
        Date from, to;
//        try {
//            from = simpleDateFormat.parse("2021-12-01");
//            to = simpleDateFormat.parse("2022-01-11");
//            ordersBetweenDates = shop.getOrders(from, to);
//            for (Order order : ordersBetweenDates) {
//                assertTrue(order.getDate().compareTo(from) >= 0 && order.getDate().compareTo(to) <= 0);
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        from = simpleDateFormat.parse("2021-12-01");
        to = simpleDateFormat.parse("2022-01-11");
        ordersBetweenDates = shop.getOrders(from, to);
        assertEquals(new Order(200.0, simpleDateFormat.parse("2022-01-01"), "login1"), ordersBetweenDates.stream().filter(order -> order.getDate().compareTo(from) >= 0 && order.getDate().compareTo(to) <= 0)
                .findFirst().orElseThrow(Exception::new));
    }

    @Test
    public void shouldReturnThreeOrdersForTheSetBetweenTwoChosenAmounts() {
        Set<Order> ordersBetweenAmounts = shop.getOrders(200.0, 500.0);
        for (Order order : ordersBetweenAmounts) {
            assertTrue(order.getAmount() >= 200.0 && order.getAmount() <= 500);
        }
    }

    @Test
    public void shouldCountOrders() {
        int numberOfAllOrders = shop.orderCount();
        assertEquals(4, numberOfAllOrders);
    }

    @Test
    public void shouldSumAllAmounts() {
        double amountsOfAllOrders = shop.amountSum();
        assertEquals(2700.0, amountsOfAllOrders, 0.01);
    }
}