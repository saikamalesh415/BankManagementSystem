package com.bank.bankapp.controller;

import com.bank.bankapp.dto.LoginRequest;
import com.bank.bankapp.model.Login;
import com.bank.bankapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginRepository loginRepo;

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest request) {
        // This line calls your repository method
        Login user = loginRepo.findByCardnumberAndPin(request.getCardnumber(), request.getPin());

        if (user != null) {
            return "Login Successful!";
        }
        return "Invalid Card Number or PIN";
    }
}
