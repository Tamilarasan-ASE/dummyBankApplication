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

    public BankAccount putAccountById(Long id, BankAccount updatedAccount) {
        return bankAccountRepositary.findById(id).map(existingAccount -> {
            existingAccount.setAccountHolderName(updatedAccount.getAccountHolderName());
            existingAccount.setAccountNumber(updatedAccount.getAccountNumber());
            existingAccount.setBalance(updatedAccount.getBalance());
            existingAccount.setGender(updatedAccount.getGender());
            existingAccount.setAccountType(updatedAccount.getAccountType());
            existingAccount.setEmail(updatedAccount.getEmail());
            existingAccount.setPhoneNumber(updatedAccount.getPhoneNumber());
            existingAccount.setStreetAddress(updatedAccount.getStreetAddress());
            existingAccount.setCity(updatedAccount.getCity());
            existingAccount.setState(updatedAccount.getState());
            existingAccount.setPostalCode(updatedAccount.getPostalCode());
            existingAccount.setCountry(updatedAccount.getCountry());
            return bankAccountRepositary.save(existingAccount);
        }).orElse(null);
    }

    public void deleteAccountById(Long id) {
        bankAccountRepositary.deleteById(id);
    }
}
