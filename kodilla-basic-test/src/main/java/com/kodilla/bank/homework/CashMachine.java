package com.kodilla.bank.homework;

public class CashMachine {
    private double[] cashMachine;
    private int size;
    double transactionValue;

    public CashMachine(int size) {
        this.size = 0;
        this.cashMachine = new double[0];
    }

    public void addTransaction(double transactionValue) {
        if (transactionValue < -5000) {
            System.out.println("You exceeded maximum value");
        } else {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(cashMachine, 0, newTab, 0, cashMachine.length);
            newTab[this.size - 1] = transactionValue;
            this.cashMachine = newTab;
        }
    }

    public double[] getCashMachine() {
        return cashMachine;
    }

    public double getBalance() {
        double sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            sum += this.cashMachine[i];
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return cashMachine.length;
    }

    public int countWithdrawTransactions() {
        int withdrawsCount = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            if (cashMachine[i] < 0) {
                withdrawsCount += 1;
            } else {
                withdrawsCount += 0;
            }
        }
        return withdrawsCount;
    }

    public int countDepositTransactions() {
        int depositsCount = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            if (cashMachine[i] > 0) {
                depositsCount += 1;
            } else {
                depositsCount += 0;
            }
        }
        return depositsCount;
    }

    public double depositSum() {
        double sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            if (cashMachine[i] > 0) {
                sum += cashMachine[i];
            }
        }
        return sum;
    }

    public double withdrawSum() {
        double sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            if (cashMachine[i] < 0) {
                sum += cashMachine[i];
            }
        }
        return sum;
    }

    public int getSize() {
        return size;
    }
}