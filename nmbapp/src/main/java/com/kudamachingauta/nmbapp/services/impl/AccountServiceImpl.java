package com.kudamachingauta.nmbapp.services.impl;

import com.kudamachingauta.nmbapp.dao.AccountRepository;
import com.kudamachingauta.nmbapp.models.Account;
import com.kudamachingauta.nmbapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;


    @Override
    public String createAccount(Account account) {
        // Check if account number is unique
        Account existingAccount = accountRepository.findByAccountNumber(account.getAccountNumber());
        if (!Objects.isNull(existingAccount)){
            throw new EntityExistsException("Account ".concat(account.getAccountNumber()).concat(" already exists."));
        }
        // Proceed to create account
        accountRepository.save(account);
        return "Account has been created";
    }

    @Override
    public String updateAccount(Account account) {
        return null;
    }

    @Override
    public String deleteAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        if (accounts.isEmpty()){
            throw new EntityNotFoundException("No accounts found");
        }
        return accounts;
    }

    @Override
    public Account getAccount(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        if (!account.isPresent()){
            throw new EntityNotFoundException("Account with id ".concat(String.valueOf(id)).concat(" not found"));
        }
        return account.get();
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber);
        if (Objects.isNull(account)){
            throw new EntityNotFoundException("Account ".concat(accountNumber).concat(accountNumber).concat(" not found"));
        }
        return account;
    }
}
