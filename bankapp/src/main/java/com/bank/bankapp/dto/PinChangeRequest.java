package com.bank.bankapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PinChangeRequest {
    @JsonProperty("cardnumber")
    private String cardnumber;

    @JsonProperty("oldpin")
    private String oldPin;

    @JsonProperty("newpin")
    private String newPin;

    // Getters and Setters
    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getOldPin() {
        return oldPin;
    }

    public void setOldPin(String oldPin) {
        this.oldPin = oldPin;
    }

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }
}
