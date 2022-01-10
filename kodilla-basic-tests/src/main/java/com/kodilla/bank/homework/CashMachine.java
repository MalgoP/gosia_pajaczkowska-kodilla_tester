package com.kodilla.bank.homework;

public class CashMachine {
    private double[] operations;
    private int operationCount;

    public CashMachine(int size) {
        operations = new double[size];
        operationCount = 0;
    }

    private void runOperation(double amount) {
        if (operationCount < operations.length) {
            operations[operationCount] = amount;
            operationCount++;
        }
    }

    public void depositMoney(double amount) {
        runOperation(amount);
    }

    public void withdrawMoney(double amount) {
        runOperation(-amount);
    }

    public int depositCount() {
        int count = 0;
        for (int i = 0; i < operationCount; i++) {
            if (operations[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int withdrawCount() {
        int count = 0;
        for (int i = 0; i < operationCount; i++) {
            if (operations[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public double depositSum() {
        double sum = 0;
        for (int i = 0; i < operationCount; i++) {
            if (operations[i] > 0) {
                sum += operations[i];
            }
        }
        return sum;
    }

    public double withdrawSum() {
        double sum = 0;
        for (int i = 0; i < operationCount; i++) {
            if (operations[i] < 0) {
                sum += -operations[i];
            }
        }
        return sum;
    }

    public double balance() {
        return depositSum() - withdrawSum();
    }

    public int getOperationCount() {
        return operationCount;
    }
}
