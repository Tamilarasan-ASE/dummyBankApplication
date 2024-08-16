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
    @Column(name="account_type", nullable = false)
    private String accountType;
    @Column(name="account_holder_name", nullable = false)
    private String accountHolderName;
    @Column(name="balance", nullable = false)
    private Double balance;
    @Column(name="gender")
    private String gender;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="street_address")
    private String streetAddress;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="postal_code")
    private String postalCode;
    @Column(name="country")
    private String country;
}
