package com.example.dummyBankApplication.BankRepositary;

import com.example.dummyBankApplication.BankModel.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepositary extends JpaRepository<BankAccount, Long> {
}
