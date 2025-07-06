package com.bank.bankapp.controller;

import com.bank.bankapp.dto.LoginRequest;
import com.bank.bankapp.model.Bank;
import com.bank.bankapp.model.Login;
import com.bank.bankapp.repository.BankRepository;
import com.bank.bankapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // ✅ This enables frontend calls
public class BalanceController {

    @Autowired
    private LoginRepository loginRepo;

    @Autowired
    private BankRepository bankRepo;

    @PostMapping("/balance")
    public String getBalance(@RequestBody LoginRequest request) {
        Login user = loginRepo.findByCardnumberAndPin(request.getCardnumber(), request.getPin());

        if (user == null) {
            return "Invalid card or pin!";
        }

        List<Bank> transactions = bankRepo.findByCardnumber(request.getCardnumber());

        int balance = 0;
        for (Bank txn : transactions) {
            if ("Deposit".equalsIgnoreCase(txn.getType())) {
                balance += txn.getAmount();
            } else if ("Withdraw".equalsIgnoreCase(txn.getType())) {
                balance -= txn.getAmount();
            }
        }

        return String.valueOf(balance);
    }
}
