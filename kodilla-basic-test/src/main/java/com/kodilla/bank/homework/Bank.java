package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] cashMachines;
    int size2 = 0;

    public Bank(int size2) {
        this.cashMachines = new CashMachine[size2];
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size2++;
        CashMachine[] newTab = new CashMachine[this.size2];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size2 - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public double bankBalance() {
        double balance = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            if (cashMachines[n] != null) {
                balance += cashMachines[n].getBalance();
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
                count += cashMachines[i].countDepositTransactions();
            }
        }
        return count;
    }

    public int withdrawCount() {
        int count = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] != null) {
                count += cashMachines[i].countWithdrawTransactions();
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