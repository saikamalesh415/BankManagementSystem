package com.bank.bankapp.controller;

import com.bank.bankapp.model.SignupTwo;
import com.bank.bankapp.repository.SignupTwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")
@CrossOrigin(origins = "*")
public class SignupTwoController {

    @Autowired
    private SignupTwoRepository signupTwoRepo;

    @PostMapping("/step2")
    public String saveStep2(@RequestBody SignupTwo signupTwo) {
        signupTwoRepo.save(signupTwo);
        return "Step 2 data saved successfully!";
    }
}