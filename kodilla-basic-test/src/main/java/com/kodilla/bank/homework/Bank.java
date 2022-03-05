package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] theMachines;
    public int numberOfMachine;

    public int totalDeposits;
    public int totalWithdrawals;
    public int totalBalance;
    public double depositAverage;
    public double withdrawalAverage;

    public Bank() {
        this.theMachines = new CashMachine[0];
        this.numberOfMachine = 0;
    }

    public void addMachine (CashMachine balance) {
        this.numberOfMachine++;
        CashMachine[] newTab = new CashMachine[this.numberOfMachine];
        System.arraycopy(theMachines, 0, newTab, 0, theMachines.length);
        newTab[this.numberOfMachine - 1] = balance;
        this.theMachines = newTab;
    }
    public int getNumberOfMachnies() {
        return numberOfMachine;
    }
    public int totalBalance() {
        totalBalance = 0;
        for (int i = 0; i < theMachines.length; i++) {
            totalBalance += theMachines[i].getBalance();
        }
        return totalBalance;
    }
    public int totalDeposits() {
        totalDeposits = 0;
        for (int i = 0; i <theMachines.length; i++) {
            if (theMachines[i].depositSize == 0) {
                return 0;
            } else {
                totalDeposits += theMachines[i].getDepositeSize();
            }
        }
        return totalDeposits;
    }
    public int totalWithdrawals () {
        totalWithdrawals = 0;
        for (int i = 0; i < theMachines.length; i++) {
            if (theMachines[i].withdrawalSize == 0) {
                return 0;
            } else {
                totalWithdrawals += theMachines[i].getWithdrawalSize();
            }
        }
        return totalWithdrawals;
    }
    public double totalDepositAverages() {
        if (totalDeposits == 0) {
            return 0;
        } else {
            depositAverage = 0;
            int sum = 0;
            for (int i = 0; i < theMachines.length; i ++) {
                sum += theMachines[i].depositSum;
            }
            depositAverage = sum / totalDeposits;
            return depositAverage;
        }
    }
    public double totalWithdrawalAverage() {
        if (totalWithdrawals == 0) {
            return 0;
        } else {
            withdrawalAverage = 0;
            int sum = 0;
            for (int i = 0; i < theMachines.length; i++) {
                sum += theMachines[i].withdrawalSum;
            }
            withdrawalAverage = sum / totalWithdrawals;
            return withdrawalAverage;
        }
    }
}
