package com.bank.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.bankapp.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
    Login findByCardnumberAndPin(String cardnumber, String pin);
}
