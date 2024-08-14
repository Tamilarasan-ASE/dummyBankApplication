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
}
