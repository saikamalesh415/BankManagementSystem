package com.bank.bankapp.dto;

public class LoginRequest {
    private String cardnumber;
    private String pin;

    // Getters and Setters
    public String getCardnumber() { return cardnumber; }
    public void setCardnumber(String cardnumber) { this.cardnumber = cardnumber; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }
}
