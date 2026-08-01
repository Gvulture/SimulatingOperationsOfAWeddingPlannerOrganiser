package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

public class Expense {
        private int expenseId;
        private String category;
        private double amount;

    public Expense(int expenseId, String category, double amount) {
        this.expenseId = expenseId;
        this.category = category;
        this.amount = amount;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
