package com.bank.bankapp.dto;

public class WithdrawRequest {
    private String cardnumber;
    private int amount;

    public String getCardnumber() { return cardnumber; }
    public void setCardnumber(String cardnumber) { this.cardnumber = cardnumber; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
}
