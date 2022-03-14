package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int balance;
    private int size;
    int depositSize;
    private int withdrawalSize;
//    public int depositSum;
//    public int withdrawalSum;

    public CashMachine (int balance){
        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
    }
    public void addTransactions(int value) {
        if (value == 0) {
            return;
        } else {
            this.size++;
            int[] newTransactions = new int[this.size];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.size - 1] = value;
            this.transactions = newTransactions;
            System.out.println("Balance " + this.getBalance());
            if (value > 0) {
                this.depositSize++;
                balance += value;
                System.out.println("Paid in " + value);
            } else if (value < 0) {
                if (balance < value * -1) {
                    System.out.println("No funds available for withdrawal.");
                } else {
                    this.withdrawalSize++;
                    balance += value;
                    System.out.println("Paid out " + value * -1);
                }
                } else {
                    System.out.println("The account balance has not changed.");
                }
                System.out.println("Balance " + this.getBalance());
                System.out.println("Total payments: " + this.getDepositeSize());
                System.out.println("Total payouts: " + this.getWithdrawalSize());
                System.out.println("Total number of operations: " + this.getSize());
            }
        }
        public int getDepositSum() {
//            depositSum = 0;
            int depositSum;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] > 0) {
                    depositSum += transactions[i];
                }
            }
            return depositSum;
        }
        public int getWithdrawalSum() {
//            withdrawalSum = 0;
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] < 0) {
                    withdrawalSum += transactions[i];
                }
            }
            return withdrawalSum;
        }
        public int[] getTransactions() {
            return transactions;
        }
        public int getBalance() {
            return balance;
        }
        public int getSize() {
            return size;
        }
        public int getDepositeSize() {
            return depositSize;
        }
        public int getWithdrawalSize() {
            return withdrawalSize;
        }
    }

