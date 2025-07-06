package com.bank.bankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SignupTwo {

    @Id
    private String formno;
    private String religion;
    private String category;
    private String income;
    private String education;
    private String occupation;
    private String pan;
    private String aadhar;
    private String seniorcitizen;
    private String existingaccount;

    // Getters and Setters
    public String getFormno() { return formno; }
    public void setFormno(String formno) { this.formno = formno; }

    public String getReligion() { return religion; }
    public void setReligion(String religion) { this.religion = religion; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getIncome() { return income; }
    public void setIncome(String income) { this.income = income; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getPan() { return pan; }
    public void setPan(String pan) { this.pan = pan; }

    public String getAadhar() { return aadhar; }
    public void setAadhar(String aadhar) { this.aadhar = aadhar; }

    public String getSeniorcitizen() { return seniorcitizen; }
    public void setSeniorcitizen(String seniorcitizen) { this.seniorcitizen = seniorcitizen; }

    public String getExistingaccount() { return existingaccount; }
    public void setExistingaccount(String existingaccount) { this.existingaccount = existingaccount; }
}
