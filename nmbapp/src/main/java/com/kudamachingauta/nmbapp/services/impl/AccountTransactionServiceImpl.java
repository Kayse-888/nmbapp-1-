package com.kudamachingauta.nmbapp.services.impl;

import com.kudamachingauta.nmbapp.models.AccountTransaction;
import com.kudamachingauta.nmbapp.services.AccountTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTransactionServiceImpl implements AccountTransactionService {

    @Autowired
    private AccountTransactionService accountTransactionService;


    @Override
    public String createTransaction(AccountTransaction accountTransaction) {
        return null;
    }

    @Override
    public String updateTransaction(AccountTransaction accountTransaction) {
        return null;
    }

    @Override
    public String deleteTransaction(Long id) {
        return null;
    }

    @Override
    public List<AccountTransaction> getAllAccountTransactions() {
        return null;
    }

    @Override
    public AccountTransaction getAccountTransaction(Long id) {
        return null;
    }
}
