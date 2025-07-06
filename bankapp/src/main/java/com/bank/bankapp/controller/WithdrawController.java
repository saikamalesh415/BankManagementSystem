package com.bank.bankapp.controller;

import com.bank.bankapp.dto.WithdrawRequest;
import com.bank.bankapp.model.Bank;
import com.bank.bankapp.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class WithdrawController {

    @Autowired
    private BankRepository bankRepo;

    @PostMapping("/withdraw")
    public String withdraw(@RequestBody WithdrawRequest req) {
        // Step 1: Fetch all transactions for this card
        List<Bank> transactions = bankRepo.findByCardnumber(req.getCardnumber());

        // Step 2: Calculate current balance
        int balance = 0;
        for (Bank txn : transactions) {
            if ("Deposit".equalsIgnoreCase(txn.getType())) {
                balance += txn.getAmount();
            } else if ("Withdraw".equalsIgnoreCase(txn.getType())) {
                balance -= txn.getAmount();
            }
        }

        // Step 3: Check if balance is enough
        if (req.getAmount() > balance) {
            return "Insufficient Balance!";
        }

        // Step 4: Save withdrawal transaction
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Bank b = new Bank(req.getCardnumber(), now, "Withdraw", req.getAmount());
        bankRepo.save(b);

        return "Amount Withdrawn Successfully!";
    }
}
