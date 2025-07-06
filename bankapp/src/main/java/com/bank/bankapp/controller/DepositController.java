package com.bank.bankapp.controller;

import com.bank.bankapp.dto.DepositRequest;
import com.bank.bankapp.model.Bank;
import com.bank.bankapp.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DepositController {

    @Autowired
    private BankRepository bankRepo;

    @PostMapping("/deposit")
    public String deposit(@RequestBody DepositRequest req) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Bank b = new Bank(req.getCardnumber(), now, "Deposit", req.getAmount());
        bankRepo.save(b);
        return "Amount deposited successfully!";
    }
}
