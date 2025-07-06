package com.bank.bankapp.controller;

import com.bank.bankapp.model.Signup;
import com.bank.bankapp.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/signup")
@CrossOrigin(origins = "*")
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;

    @PostMapping("/step1")
    public Map<String, Object> saveStep1(@RequestBody Signup signup) {
        Map<String, Object> response = new HashMap<>();
        try {
            // Generate unique form number
            String generatedFormNo = "FORM" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            signup.setFormno(generatedFormNo);

            signupRepository.save(signup);

            response.put("status", "success");
            response.put("formno", generatedFormNo);
            return response;
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Failed to save signup step 1");
            return response;
        }
    }
}
