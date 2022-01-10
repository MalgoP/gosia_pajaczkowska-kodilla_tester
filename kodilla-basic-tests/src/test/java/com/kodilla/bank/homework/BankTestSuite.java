package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateDepositsAverage() {
        Bank bank = new Bank(3);
        bank.addMachine(5);
        bank.addMachine(5);
        bank.addMachine(5);
        bank.deposit(0, 100.0);
        bank.deposit(1, 200.0);
        bank.deposit(1, 5000.0);
        bank.deposit(2, 1500.0);
        bank.deposit(2, 100.0);
        bank.deposit(2, 30000.0);
        assertEquals(6150.0, bank.averageDepositCashMachine());
    }

    @Test
    public void shouldCalculateWithdrawAverage() {
        Bank bank = new Bank(2);
        bank.addMachine(4);
        bank.addMachine(6);
        bank.withdraw(0, 200.0);
        bank.withdraw(0, 600.0);
        bank.withdraw(0, 100.0);
        bank.withdraw(0, 400.0);
        bank.withdraw(1, 100.0);
        bank.withdraw(1, 100.0);
        bank.withdraw(1, 100.0);
        assertEquals(228.57, bank.averageWithdrawCashMachine(), 0.01);
    }

    @Test
    public void shouldWorkBankWithZeroCashMachine() {
        Bank bank = new Bank(1);
        assertEquals(0, bank.balance());
        assertEquals(0, bank.averageWithdrawCashMachine());
        assertEquals(0, bank.averageDepositCashMachine());
    }

    @Test
    public void shouldCountDeposits() {
        Bank bank = new Bank(3);
        bank.addMachine(3);
        bank.addMachine(2);
        bank.deposit(0, 100.0);
        bank.deposit(0, 100.0);
        bank.deposit(0, 100.0);
        bank.deposit(1, 200.0);
        bank.deposit(1, 200.0);
        assertEquals(5, bank.depositCount());
    }

    @Test
    public void shouldCountWithdraw() {
        Bank bank = new Bank(3);
        bank.addMachine(3);
        bank.addMachine(2);
        bank.withdraw(0, 100.0);
        bank.withdraw(0, 100.0);
        bank.withdraw(1, 100.0);
        assertEquals(3, bank.withdrawCount());
    }

    @Test
    public void shouldSumDeposit() {
        Bank bank = new Bank(2);
        bank.addMachine(2);
        bank.addMachine(2);
        bank.deposit(0, 100.0);
        bank.deposit(0, 1000.0);
        bank.deposit(1, 200.0);
        bank.deposit(1, 200.0);
        assertEquals(1500.0, bank.depositSum());
    }

    @Test
    public void shouldSumWithdrawals() {
        Bank bank = new Bank(2);
        bank.addMachine(2);
        bank.addMachine(2);
        bank.withdraw(0, 1000.0);
        bank.withdraw(0, 100.0);
        bank.withdraw(1, 100.0);
        assertEquals(1200, bank.withdrawSum());
    }
}
