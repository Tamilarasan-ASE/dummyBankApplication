package com.example.dummyBankApplication.BankController;

import com.example.dummyBankApplication.BankModel.BankAccount;
import com.example.dummyBankApplication.BankService.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummyBank")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping
    public List<BankAccount> getAllAccounts(){
        return bankAccountService.getAllAccounts();
    }
    @PostMapping
    public BankAccount createAccount(@RequestBody BankAccount bankAccount){
        return bankAccountService.createAccount(bankAccount);
    }
    @GetMapping("/{id}")
    public BankAccount getAccountById(@PathVariable Long id){
        return bankAccountService.getAccountById(id);
    }
    @PutMapping("/{id}")
    public BankAccount putAccountById(@PathVariable Long id,@RequestBody BankAccount updatedAccount) {
        return bankAccountService.putAccountById(id, updatedAccount);
    }
    @DeleteMapping("/{id}")
    public void deleteAccountById(@PathVariable Long id){
        bankAccountService.deleteAccountById(id);
    }
}
