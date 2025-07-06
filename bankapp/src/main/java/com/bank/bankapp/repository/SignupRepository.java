
package com.bank.bankapp.repository;

import com.bank.bankapp.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<Signup, String> {
}
