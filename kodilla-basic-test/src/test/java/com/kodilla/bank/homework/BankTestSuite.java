package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine cashMachineTest = new CashMachine(0);
    CashMachine cashMachineTest2 = new CashMachine(0);
    CashMachine cashMachineTest3 = new CashMachine(0);
    Bank bankTest = new Bank(0);

    @Test
    public void cashMachineShouldHaveZeroLength() {
        assertEquals(0, cashMachineTest.getSize());
    }

    @Test
    public void cashMachineShouldHaveOneTransaction() {
        cashMachineTest.addTransaction(100);
        assertEquals(1, cashMachineTest.getSize());
    }

    @Test
    public void cashMachineShouldHaveTwoTransactions() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-200);
        assertEquals(2, cashMachineTest.getSize());
    }

    @Test
    public void cashMachineShouldHaveOneTransaction2() {
        cashMachineTest.addTransaction(100);
        assertEquals(1, cashMachineTest.getNumberOfTransactions());
    }

    @Test
    public void cashMachineShouldHaveTwoTransactions2() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-200);
        assertEquals(2, cashMachineTest.getNumberOfTransactions());
    }

    @Test
    public void cashMachineBalanceShouldBeZero() {
        assertEquals(0.0, cashMachineTest.getBalance());
    }

    @Test
    public void cashMachineBalanceShouldBeOneHundred() {
        cashMachineTest.addTransaction(100);
        assertEquals(100.0, cashMachineTest.getBalance());
    }

    @Test
    public void cashMachineBalanceShouldBeMinusOneHundred() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-200);
        assertEquals(-100.0, cashMachineTest.getBalance());
    }

    @Test
    public void cashMachineBalanceShouldBeOneHundredPlus() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction (-4999);
        cashMachineTest.addTransaction(200.5);
        assertEquals(-4698.5, cashMachineTest.getBalance());
    }

    @Test
    public void countWithdrawTransactionsShouldHaveBeenZero() {
        assertEquals(0, cashMachineTest.countWithdrawTransactions());
    }

    @Test
    public void countWithdrawTransactionsShouldHaveBeenZero2() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(200.5);
        assertEquals(0, cashMachineTest.countWithdrawTransactions());
    }

    @Test
    public void countWithdrawTransactionsShouldHaveBeenOne() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-200);
        cashMachineTest.addTransaction(200.5);
        assertEquals(1, cashMachineTest.countWithdrawTransactions());
    }

    @Test
    public void countDepositTransactionsShouldHaveBeenZero() {
        assertEquals(0, cashMachineTest.countDepositTransactions());
    }

    @Test
    public void countDepositTransactionsShouldHaveBeenZero2() {
        cashMachineTest.addTransaction(-100);
        cashMachineTest.addTransaction(-200.5);
        assertEquals(0, cashMachineTest.countDepositTransactions());
    }

    @Test
    public void countDepositTransactionsShouldHaveBeenOne() {
        cashMachineTest.addTransaction(-100);
        cashMachineTest.addTransaction(200);
        cashMachineTest.addTransaction(-200.5);
        assertEquals(1, cashMachineTest.countDepositTransactions());
    }

    @Test
    public void depositSumShouldHaveBeenZero() {
        assertEquals(0, cashMachineTest.depositSum());
    }

    @Test
    public void depositSumShouldHaveBeenOneHundred() {
        cashMachineTest.addTransaction(100);
        assertEquals(100, cashMachineTest.depositSum());
    }

    @Test
    public void depositSumShouldHaveBeenThreeHundred() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(200);
        assertEquals(300, cashMachineTest.depositSum());
    }

    @Test
    public void depositSumShouldHaveNotCountWithdrawals() {
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(200);
        cashMachineTest.addTransaction(-200);
        assertEquals(300, cashMachineTest.depositSum());
    }

    @Test
    public void withdrawSumShouldHaveBeenZero() {
        assertEquals(0, cashMachineTest.withdrawSum());
    }

    @Test
    public void withdrawSumShouldHaveBeenOneMinusHundred() {
        cashMachineTest.addTransaction(-100);
        assertEquals(-100, cashMachineTest.withdrawSum());
    }

    @Test
    public void withdrawSumShouldHaveBeenMinusThreeHundred() {
        cashMachineTest.addTransaction(-100);
        cashMachineTest.addTransaction(-200);
        assertEquals(-300, cashMachineTest.withdrawSum());
    }

    @Test
    public void withdrawSumShouldHaveNotCountDeposits() {
        cashMachineTest.addTransaction(-100);
        cashMachineTest.addTransaction(200);
        cashMachineTest.addTransaction(-200);
        assertEquals(-300, cashMachineTest.withdrawSum());
    }

    @Test
    public void bankShouldHaveZeroLength() {
        assertEquals(0, bankTest.size2);
    }

    @Test
    public void bankShouldHaveOneCashMachine() {
        bankTest.addCashMachine(cashMachineTest);
        assertEquals(1, bankTest.size2);
    }

    @Test
    public void bankShouldHaveThreeCashMachines() {
        bankTest.addCashMachine(cashMachineTest);
        bankTest.addCashMachine(cashMachineTest2);
        bankTest.addCashMachine(cashMachineTest3);
        assertEquals(3, bankTest.size2);
    }

    @Test
    public void bankBalanceShouldBeZero() {
        assertEquals(0, bankTest.bankBalance());
    }

    @Test
    public void bankBalanceShouldBeOneHundred() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        assertEquals(100, bankTest.bankBalance());
    }

    @Test
    public void bankBalanceShouldCountAllTransactions() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        assertEquals(0, bankTest.bankBalance());
    }

    @Test
    public void bankBalanceShouldCountAllTransactions2() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(100, bankTest.bankBalance());
    }

    @Test
    public void bankDepositSumShouldBeZero() {
        assertEquals(0, bankTest.depositSum());
    }

    @Test
    public void bankDepositSumShouldBeOneHundred() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        assertEquals(100, bankTest.depositSum());
    }

    @Test
    public void bankDepositSumShouldNotCountWithdrawals() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        assertEquals(100, bankTest.depositSum());
    }

    @Test
    public void bankDepositSumShouldNotCountWithdrawals2() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(300, bankTest.depositSum());
    }

    @Test
    public void bankWithdrawSumShouldBeZero() {
        assertEquals(0, bankTest.withdrawSum());
    }

    @Test
    public void bankWithdrawSumShouldBeMinusOneHundred() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(-100);
        assertEquals(-100, bankTest.withdrawSum());
    }

    @Test
    public void bankWithdrawSumShouldNotCountDeposits() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        assertEquals(-100, bankTest.withdrawSum());
    }

    @Test
    public void bankWithdrawSumShouldNotCountDeposits2() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(-200, bankTest.withdrawSum());
    }

    @Test
    public void bankDepositCountShouldBeZero() {
        assertEquals(0, bankTest.depositCount());
    }

    @Test
    public void bankDepositCountShouldEqualOne() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        assertEquals(1, bankTest.depositCount());
    }

    @Test
    public void bankDepositCountShouldNotCountWithdrawals() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(2, bankTest.depositCount());
    }

    @Test
    public void bankWithdrawCountShouldBeZero() {
        assertEquals(0, bankTest.withdrawCount());
    }

    @Test
    public void bankWithdrawCountShouldEqualOne() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(-100);
        assertEquals(1, bankTest.withdrawCount());
    }

    @Test
    public void bankWithdrawCountShouldNotCountDeposits() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(2, bankTest.withdrawCount());
    }

    @Test
    public void averageDepositCashMachineShouldBeZero() {
        assertEquals(0, bankTest.averageDepositCashMachine());
    }

    @Test
    public void checkAverageDepositCashMachine1() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-100);
        assertEquals(150, bankTest.averageDepositCashMachine());
    }

    @Test
    public void averageWithdrawCashMachineShouldBeZero() {
        assertEquals(0, bankTest.averageWithdrawCashMachine());
    }

    @Test
    public void checkAverageWithdrawCashMachine1() {
        bankTest.addCashMachine(cashMachineTest);
        cashMachineTest.addTransaction(100);
        cashMachineTest.addTransaction(-100);
        bankTest.addCashMachine(cashMachineTest2);
        cashMachineTest2.addTransaction(200);
        cashMachineTest2.addTransaction(-200);
        assertEquals(-150, bankTest.averageWithdrawCashMachine());
    }
}