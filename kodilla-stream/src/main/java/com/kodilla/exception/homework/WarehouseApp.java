package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("24/2020"));
        warehouse.addOrder(new Order("26/2020"));
        warehouse.addOrder(new Order("34/2021"));
        warehouse.addOrder(new Order("38/2021"));
        try {
            Order isOrderInUse = warehouse.getOrder("25/2020");
            System.out.println("Order: " + isOrderInUse.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry this number of the order is not exist. ");
        }
    }
}
