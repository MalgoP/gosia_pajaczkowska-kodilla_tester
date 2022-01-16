package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("24/2020"));
        warehouse.addOrder(new Order("26/2020"));
        String numberToSearch = new String("26/2020");
        Order order = warehouse.getOrder(numberToSearch);
        assertNotNull(order);
        assertEquals(numberToSearch, order.getNumber());
    }

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("24/2020"));
        warehouse.addOrder(new Order("26/2020"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("20/2020"));
    }
}