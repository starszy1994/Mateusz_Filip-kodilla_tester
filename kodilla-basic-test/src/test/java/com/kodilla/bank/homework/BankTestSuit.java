package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    Bank thisBank = new Bank();
    CashMachine machine1 = new CashMachine(2500);
    CashMachine machine2 = new CashMachine(1000);
    CashMachine machine3 = new CashMachine(1500);

    @Test
    public void czyTablicaJestPustaNaPoczatku() {
        thisBank.getNumberOfMachnies();
        assertEquals(0, thisBank.getNumberOfMachnies());
    }
    @Test
    public void czyDodajeBankomatWedlugMetody () {
        thisBank.addMachine(machine1);
        thisBank.getNumberOfMachnies();
        assertEquals(1, thisBank.numberOfMachine);
        assertEquals(2500, machine1.balance);
        thisBank.addMachine(machine2);
        thisBank.getNumberOfMachnies();
        assertEquals(2, thisBank.numberOfMachine);
        assertEquals(1000, machine2.balance);
        thisBank.addMachine(machine3);
        thisBank.getNumberOfMachnies();
        assertEquals(3, thisBank.numberOfMachine);
        assertEquals(1500, machine3.balance);
    }
    @Test
    public void czyBankomatDodajeTransakcjeZMetodyCashMachine() {
        thisBank.addMachine(machine1);
        machine1.addTransactions(250);
        assertEquals(250, machine1.transactions[0]);
        machine1.addTransactions(-200);
        assertEquals(-200, machine1.transactions[1]);
    }
    @Test
    public void czyPrzeliczaSaldoMetodaZCashMachine () {
        thisBank.addMachine(machine1);
        machine1.addTransactions(250);
        assertEquals(2750, machine1.balance);
        machine1.addTransactions(-100);
        assertEquals(2650, machine1.balance);
    }
    @Test
    public void czyLiczyBilansCalkowity () {
        thisBank.addMachine(machine1);
        machine1.getBalance();
        thisBank.addMachine(machine2);
        machine2.getBalance();
        thisBank.addMachine(machine3);
        machine3.getBalance();
        assertEquals(5000, thisBank.totalBalance());
    }
    @Test
    public void czyLiczyLacznaIloscWplat () {
        thisBank.addMachine(machine1);
        machine1.addTransactions(150);
        machine1.getDepositeSize();
        thisBank.addMachine(machine2);
        machine2.addTransactions(100);
        machine2.getDepositeSize();
        thisBank.addMachine(machine3);
        machine3.addTransactions(250);
        machine3.getDepositeSize();
        assertEquals(3, thisBank.totalDeposits());
    }
    @Test
    public void czyLiczyLacznaIloscWyplat() {
        thisBank.addMachine(machine1);
        machine1.addTransactions(-150);
        machine1.getWithdrawalSum();
        thisBank.addMachine(machine2);
        machine2.addTransactions(-100);
        machine2.getWithdrawalSum();
        thisBank.addMachine(machine3);
        machine3.addTransactions(-250);
        machine3.getWithdrawalSum();
        assertEquals(3, thisBank.totalWithdrawals());
    }
    @Test
    public void czyNieLiczyLacznejIlosciWplatPrzyZerowejWplacie() {
        thisBank.addMachine(machine1);
        machine1.getDepositeSize();
        thisBank.addMachine(machine2);
        machine2.getDepositeSize();
        thisBank.addMachine(machine3);
        machine3.getDepositeSize();
        assertEquals(0, thisBank.totalDeposits());
    }
    @Test
    public void czyNieLiczyLacznejIlosciWyplatPrzyZerowejWyplacie() {
        thisBank.addMachine(machine1);
        machine1.getWithdrawalSum();
        thisBank.addMachine(machine2);
        machine2.getWithdrawalSum();
        thisBank.addMachine(machine3);
        machine3.getWithdrawalSum();
        assertEquals(0, thisBank.totalWithdrawals());
    }
    @Test
    public void czyLiczySredniaWartoscWplatPrzyDodatniejIlosciWplat () {
        thisBank.addMachine(machine1);
        thisBank.addMachine(machine2);
        thisBank.addMachine(machine3);
        machine1.addTransactions(200);
        machine1.addTransactions(100);
        machine1.getDepositeSize();
        machine1.getDepositSum();
        machine2.addTransactions(100);
        machine2.addTransactions(300);
        machine2.getDepositeSize();
        machine2.getDepositSum();
        machine3.addTransactions(400);
        machine3.addTransactions(250);
        machine3.getDepositeSize();
        machine3.getDepositSum();
        thisBank.totalDeposits();
        thisBank.totalDepositAverages();
        assertEquals(225, thisBank.totalDepositAverages());
    }
    @Test
    public void czyNieLiczySredniejWplatPrzyZeroowychWplatach() {
        thisBank.addMachine(machine1);
        thisBank.addMachine(machine2);
        thisBank.addMachine(machine3);
        machine1.getDepositeSize();
        machine1.getDepositSum();
        machine2.getDepositeSize();
        machine2.getDepositSum();
        machine3.getDepositeSize();
        machine3.getDepositSum();
        thisBank.totalDeposits();
        thisBank.totalDepositAverages();
        assertEquals(0, thisBank.totalDepositAverages());
    }
    @Test
    public void czyLiczySredniaWartoscWyplatPrzyDodatniejIlosciWyplat () {
        thisBank.addMachine(machine1);
        thisBank.addMachine(machine2);
        thisBank.addMachine(machine3);
        machine1.addTransactions(-200);
        machine1.addTransactions(-100);
        machine1.getWithdrawalSize();
        machine1.getWithdrawalSum();
        machine2.addTransactions(-100);
        machine2.addTransactions(-100);
        machine2.getWithdrawalSize();
        machine2.getWithdrawalSum();
        machine3.addTransactions(-400);
        machine3.addTransactions(-200);
        machine3.getWithdrawalSize();
        machine3.getWithdrawalSize();
        thisBank.totalWithdrawals();
        thisBank.totalDepositAverages();
        assertEquals(-83, thisBank.totalWithdrawalAverage());
    }
    @Test
    public void czyNieLiczySredniejWyplatyPrzyZerowychWyplatach() {
        thisBank.addMachine(machine1);
        thisBank.addMachine(machine2);
        thisBank.addMachine(machine3);
        machine1.getWithdrawalSize();
        machine1.getWithdrawalSum();
        machine2.getWithdrawalSize();
        machine2.getWithdrawalSum();
        machine3.getWithdrawalSize();
        machine3.getWithdrawalSum();
        thisBank.totalWithdrawals();
        thisBank.totalWithdrawalAverage();
        assertEquals(0, thisBank.totalDepositAverages());
    }
}
