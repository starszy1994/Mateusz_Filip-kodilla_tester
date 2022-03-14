package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] theMachines;
    public int numberOfMachine;
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
        int totalBalance = 0;
        for (int i = 0; i < theMachines.length; i++) {
            totalBalance += theMachines[i].getBalance();
        }
        return totalBalance;
    }
    public int totalDeposits() {
        int totalDeposits = 0;
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
        int totalWithdrawals = 0;
        for (int i = 0; i < theMachines.length; i++) {
            if (theMachines[i].getWithdrawalSize() == 0) {
                return 0;
            } else {
                totalWithdrawals += theMachines[i].getWithdrawalSize();
            }
        }
        return totalWithdrawals;
    }
    public double totalDepositAverages() {
        int totalDeposits = dis.total.deposite; // wywoałć metodę total deposite -
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
    public double totalWithdrawalAverage() {   // tak samo jak z total deposite
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
