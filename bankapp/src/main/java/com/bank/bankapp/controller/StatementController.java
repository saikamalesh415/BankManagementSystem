package com.bank.bankapp.controller;

import com.bank.bankapp.dto.LoginRequest;
import com.bank.bankapp.model.Bank;
import com.bank.bankapp.repository.BankRepository;
import com.bank.bankapp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 🔥 THIS FIXES THE CORS ISSUE
public class StatementController {

    @Autowired
    private BankRepository bankRepo;

    @Autowired
    private LoginRepository loginRepo;

    @PostMapping("/statement")
    public List<Map<String, Object>> getStatement(@RequestBody LoginRequest req) {
        List<Bank> transactions = bankRepo.findByCardnumber(req.getCardnumber());

        int balance = 0;
        List<Map<String, Object>> result = new ArrayList<>();

        for (Bank txn : transactions) {
            if ("Deposit".equalsIgnoreCase(txn.getType())) {
                balance += txn.getAmount();
            } else if ("Withdraw".equalsIgnoreCase(txn.getType())) {
                balance -= txn.getAmount();
            }

            Map<String, Object> row = new LinkedHashMap<>();
            row.put("date", txn.getDate());
            row.put("type", txn.getType());
            row.put("amount", txn.getAmount());
            row.put("balance", balance);
            result.add(row);
        }

        return result;
    }
}
