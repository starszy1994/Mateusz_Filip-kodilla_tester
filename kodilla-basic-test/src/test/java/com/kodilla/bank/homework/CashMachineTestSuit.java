package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {

    CashMachine cashMachnie = new CashMachine(5000);

    @Test
    public void czyJestPustaNaPoczatku() {
        CashMachine cashMachine = new CashMachine(5000);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void czyDodajeTransakcjaDobraMetoda() {
        cashMachnie.addTransactions(250);
        assertEquals(1, cashMachnie.getSize());
        cashMachnie.addTransactions(-50);
        assertEquals(2, cashMachnie.getSize());
    }

    @Test
    public void czyNieUruchamiaMetodyPrzyWartosciZero() {
        cashMachnie.addTransactions(0);
        assertEquals(0, cashMachnie.getSize());
        assertEquals(0, cashMachnie.getDepositeSize());
        assertEquals(0, cashMachnie.getWithdrawalSize());
    }
    @Test
    public void czyResestrujeWplatePrzyKwocieDodatniej() {
        cashMachnie.addTransactions(200);
        assertEquals(1, cashMachnie.getDepositeSize());
    }
    @Test
    public void czyRejestrujeWyplatePrzyKwocieUjemniej() {
        cashMachnie.addTransactions(-200);
        assertEquals(1, cashMachnie.getWithdrawalSize());
    }
    @Test
    public void czyDodajeDoSaldaPrzyWplacieDodatniej() {
        cashMachnie.addTransactions(600);
        assertEquals(5600, cashMachnie.getBalance());
    }
    @Test
    public void czyOdejmujeOdSaldaPrzyWyplacie() {
        cashMachnie.addTransactions(-200);
        assertEquals(4800, cashMachnie.getBalance());
    }
    @Test
    public void czyNieDodajeDoSaldaPrzyZerowejWplacie() {
        cashMachnie.addTransactions(0);
        assertEquals(5000, cashMachnie.getBalance());
    }
    @Test
    public void czyZatrzymujeWyplatyPoOsiagnieciuZerowegoSalda() {
        cashMachnie.addTransactions(-6000);
        assertEquals(5000, cashMachnie.getBalance());
        assertEquals(0, cashMachnie.getWithdrawalSize());
    }
    @Test
    public void czySumujeWartosciWyplat() {
        cashMachnie.addTransactions(-90);
        cashMachnie.addTransactions(-300);
        cashMachnie.addTransactions(-820);
        cashMachnie.getWithdrawalSum();
        assertEquals(-1210, cashMachnie.getWithdrawalSum());
    }
    @Test
    public void czyNieDodajeWplatDoWyplat() {
        cashMachnie.addTransactions(-100);
        cashMachnie.addTransactions(250);
        cashMachnie.addTransactions(320);
        cashMachnie.addTransactions(-200);
        cashMachnie.getDepositSum();
        assertEquals(-300, cashMachnie.getWithdrawalSum());
    }
    @Test
    public void czyNieDodajeWyplatDoWplat() {
        cashMachnie.addTransactions(200);
        cashMachnie.addTransactions(-100);
        cashMachnie.addTransactions(-250);
        cashMachnie.addTransactions(450);
        cashMachnie.getDepositSum();
        assertEquals(650, cashMachnie.getDepositSum());
    }
    @Test
    public void czySumujeWartoscWplat () {
        cashMachnie.addTransactions(250);
        cashMachnie.addTransactions(250);
        cashMachnie.addTransactions(500);
        cashMachnie.addTransactions(100);
        cashMachnie.getDepositSum();
        assertEquals(1100, cashMachnie.getDepositSum());
    }
}
