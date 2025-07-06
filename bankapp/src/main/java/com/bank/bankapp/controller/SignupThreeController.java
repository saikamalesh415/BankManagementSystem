package com.bank.bankapp.controller;

import com.bank.bankapp.model.Login;
import com.bank.bankapp.model.SignupThree;
import com.bank.bankapp.repository.LoginRepository;
import com.bank.bankapp.repository.SignupThreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/signup")
@CrossOrigin(origins = "*")
public class SignupThreeController {

    @Autowired
    private SignupThreeRepository signupThreeRepo;

    @Autowired
    private LoginRepository loginRepo;

    @PostMapping("/step3")
    public String saveStep3(@RequestBody SignupThree signupThree) {
        // Generate card number and pin
        String cardNumber = String.valueOf(1000000000000000L + new Random().nextLong(900000000000000L));
        String pin = String.format("%04d", new Random().nextInt(10000));

        signupThree.setCardnumber(cardNumber);
        signupThree.setPin(pin);

        // Save to signupthree table
        signupThreeRepo.save(signupThree);

        // Save to login table
        Login login = new Login();
        login.setFormno(signupThree.getFormno());
        login.setCardnumber(cardNumber);
        login.setPin(pin);

        loginRepo.save(login);

        return "Signup complete! Card No: " + cardNumber + ", PIN: " + pin;
    }
}
