package com.bank.bankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {

    @Id
    private String formno;
    private String cardnumber;
    private String pin;

    // Getters and Setters
    public String getFormno() { return formno; }
    public void setFormno(String formno) { this.formno = formno; }

    public String getCardnumber() { return cardnumber; }
    public void setCardnumber(String cardnumber) { this.cardnumber = cardnumber; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }
}
