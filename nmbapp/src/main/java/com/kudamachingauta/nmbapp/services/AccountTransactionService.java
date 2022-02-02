package com.kudamachingauta.nmbapp.services;

import com.kudamachingauta.nmbapp.models.AccountTransaction;

import java.util.List;

public interface AccountTransactionService {
    String createTransaction(AccountTransaction accountTransaction);
    String updateTransaction(AccountTransaction accountTransaction);
    String deleteTransaction(Long id);
    List<AccountTransaction> getAllAccountTransactions();
    AccountTransaction getAccountTransaction(Long id);
}
