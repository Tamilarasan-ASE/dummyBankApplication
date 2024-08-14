package com.example.dummyBankApplication.BankService;

import com.example.dummyBankApplication.BankModel.BankAccount;
import com.example.dummyBankApplication.BankRepositary.BankAccountRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepositary bankAccountRepositary;

    public List<BankAccount> getAllAccounts(){
        return bankAccountRepositary.findAll();
    }
    public BankAccount createAccount(BankAccount bankAccount){
        return bankAccountRepositary.save(bankAccount);
    }
    public BankAccount getAccountById(Long id){
        return bankAccountRepositary.findById(id).orElse(null);
    }
}
