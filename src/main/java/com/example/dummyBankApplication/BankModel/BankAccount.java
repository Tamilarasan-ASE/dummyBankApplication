package com.example.dummyBankApplication.BankModel;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bank_accounts")
@Data
@NoArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="account_number", nullable = false)
    private String accountNumber;
    @Column(name="account_holder_name", nullable = false)
    private String accountHolderName;
    @Column(name="balance", nullable = false)
    private Double balance;
}
