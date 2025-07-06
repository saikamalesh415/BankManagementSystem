package com.bank.bankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SignupThree {

    @Id
    private String formno;
    private String accounttype;
    private String cardnumber;
    private String pin;
    private String facility;

    // Getters and Setters
    public String getFormno() { return formno; }
    public void setFormno(String formno) { this.formno = formno; }

    public String getAccounttype() { return accounttype; }
    public void setAccounttype(String accounttype) { this.accounttype = accounttype; }

    public String getCardnumber() { return cardnumber; }
    public void setCardnumber(String cardnumber) { this.cardnumber = cardnumber; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public String getFacility() { return facility; }
    public void setFacility(String facility) { this.facility = facility; }
}
