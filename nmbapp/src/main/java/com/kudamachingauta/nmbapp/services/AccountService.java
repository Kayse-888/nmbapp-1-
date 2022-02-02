package com.kudamachingauta.nmbapp.services;

import com.kudamachingauta.nmbapp.models.Account;

import java.util.List;

public interface AccountService {
    String createAccount(Account account);
    String updateAccount(Account account);
    String deleteAccount(Long id);
    List<Account> getAllAccounts();
    Account getAccount(Long id);
    Account findByAccountNumber(String accountNumber);
}
