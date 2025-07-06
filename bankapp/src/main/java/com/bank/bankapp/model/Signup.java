// ✅ Updated Signup.java with proper formatting
package com.bank.bankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Signup {

    @Id
    private String formno;
    private String name;
    private String fname;
    private String dob;
    private String gender;
    private String email;
    private String marital;
    private String address;
    private String city;
    private String pin;
    private String state;

    // Getters and Setters
    public String getFormno() { return formno; }
    public void setFormno(String formno) { this.formno = formno; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMarital() { return marital; }
    public void setMarital(String marital) { this.marital = marital; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}