package com.bank.bankapp.repository;

import com.bank.bankapp.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BankRepository extends JpaRepository<Bank, String> {
    List<Bank> findByCardnumber(String cardnumber);
}
