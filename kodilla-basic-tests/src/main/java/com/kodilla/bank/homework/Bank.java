package com.kodilla.bank.homework;

import com.sun.source.tree.NewArrayTree;

public class Bank {
    CashMachine[] cashMachines;

    public Bank(int size) {
        cashMachines = new CashMachine[size];
    }

    public void deposit(int cashMachineIndex, double amount) {
        cashMachines[cashMachineIndex].depositMoney(amount);
    }

    public void withdraw(int cashMachineIndex, double amount) {
        cashMachines[cashMachineIndex].withdrawMoney(amount);
    }

    public void addMachine(int operationSize) {
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] == null) {
                cashMachines[i] = new CashMachine(operationSize);
                return;
            }
        }
    }

    public double balance() {
        double balance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                balance += cashMachines[i].balance();
            }
        }
        return balance;
    }

    public double depositSum() {
        double depositSum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                depositSum += cashMachines[i].depositSum();
            }
        }
        return depositSum;
    }

    public double withdrawSum() {
        double withdrawSum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                withdrawSum += cashMachines[i].withdrawSum();
            }
        }
        return withdrawSum;
    }

    public int depositCount() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                count += cashMachines[i].depositCount();
            }
        }
        return count;
    }

    public int withdrawCount() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                count += cashMachines[i].withdrawCount();
            }
        }
        return count;
    }

    public double averageDepositCashMachine() {
        if (depositCount() == 0) {
            return 0;
        }
        return depositSum() / depositCount();
    }

    public double averageWithdrawCashMachine() {
        if (withdrawCount() == 0) {
            return 0;
        }
        return withdrawSum() / withdrawCount();
    }
}
