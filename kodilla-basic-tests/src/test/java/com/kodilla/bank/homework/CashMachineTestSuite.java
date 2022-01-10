package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldAddJustThreeDepositMoneyAndCountJustDeposit() {
        CashMachine cashMachine = new CashMachine(3);
        assertEquals(0, cashMachine.getOperationCount());
        cashMachine.depositMoney(1500.0);
        assertEquals(1, cashMachine.getOperationCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationCount());
        cashMachine.depositMoney(300.0);
        assertEquals(2, cashMachine.getOperationCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationCount());
        cashMachine.depositMoney(4000.0);
        assertEquals(3, cashMachine.getOperationCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationCount());
        cashMachine.depositMoney(150.0);
        assertEquals(3, cashMachine.getOperationCount());
        assertEquals(cashMachine.depositCount(), cashMachine.getOperationCount());
        assertEquals(0, cashMachine.withdrawCount());
    }

    @Test
    public void shouldAddFourWithdrawMoney() {
        CashMachine cashMachine = new CashMachine(4);
        assertEquals(0, cashMachine.getOperationCount());
        cashMachine.withdrawMoney(100.0);
        assertEquals(1, cashMachine.getOperationCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationCount());
        cashMachine.withdrawMoney(1000.0);
        assertEquals(2, cashMachine.getOperationCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationCount());
        cashMachine.withdrawMoney(400.0);
        assertEquals(3, cashMachine.getOperationCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationCount());
        cashMachine.withdrawMoney(2000.0);
        assertEquals(4, cashMachine.getOperationCount());
        assertEquals(cashMachine.withdrawCount(), cashMachine.getOperationCount());
    }

    private static CashMachine prepareCashMachineForSumTest() {
        CashMachine cashMachine = new CashMachine(10);
        cashMachine.depositMoney(300.0);
        cashMachine.withdrawMoney(500.0);
        cashMachine.depositMoney(400.0);
        cashMachine.withdrawMoney(300.0);
        cashMachine.depositMoney(500.0);
        cashMachine.withdrawMoney(1200.0);
        cashMachine.depositMoney(2000.0);
        return cashMachine;
    }

    @Test
    public void shouldSumWithdrawals() {
        CashMachine cashMachine = prepareCashMachineForSumTest();
        assertEquals(3, cashMachine.withdrawCount());
        assertEquals(2000.0, cashMachine.withdrawSum(), 0.001);
    }

    @Test
    public void shouldSumDeposit() {
        CashMachine cashMachine = prepareCashMachineForSumTest();
        assertEquals(4, cashMachine.depositCount());
        assertEquals(3200.0, cashMachine.depositSum(), 0.001);
    }

    @Test
    public void shouldBalanceDepositsAndWithdraw() {
        CashMachine cashMachine = new CashMachine(5);
        cashMachine.depositMoney(20000.0);
        cashMachine.withdrawMoney(500.0);
        cashMachine.depositMoney(100.0);
        cashMachine.withdrawMoney(500.0);
        cashMachine.depositMoney(100.0);
        assertEquals(3, cashMachine.depositCount());
        assertEquals(2, cashMachine.withdrawCount());
        assertEquals(19200.0, cashMachine.balance(), 0.001);
    }
}
