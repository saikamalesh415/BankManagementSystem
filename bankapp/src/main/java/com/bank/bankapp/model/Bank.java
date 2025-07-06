package com.bank.bankapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 🔥 AUTO-INCREMENT
    private int id;

    private String cardnumber;
    private String date;
    private String type; // "Deposit", "Withdraw"
    private int amount;

    public Bank() {}

    public Bank(String cardnumber, String date, String type, int amount) {
        this.cardnumber = cardnumber;
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    // Getters & Setters
    public int getId() { return id; }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
