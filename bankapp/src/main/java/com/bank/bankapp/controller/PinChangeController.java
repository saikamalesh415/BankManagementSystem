package com.bank.bankapp.controller;

import com.bank.bankapp.dto.PinChangeRequest;
import com.bank.bankapp.model.Login;
import com.bank.bankapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PinChangeController {

    @Autowired
    private LoginRepository loginRepo;

    @PostMapping("/changepin")
    public String changePin(@RequestBody PinChangeRequest request) {
        String cardnumber = request.getCardnumber().trim();
        String oldPin = request.getOldPin().trim();
        String newPin = request.getNewPin().trim();

        Login user = loginRepo.findByCardnumberAndPin(cardnumber, oldPin);

        if (user == null) {
            return "Old PIN is incorrect!";
        }

        user.setPin(newPin);
        loginRepo.save(user);

        return "PIN updated successfully!";
    }

}
