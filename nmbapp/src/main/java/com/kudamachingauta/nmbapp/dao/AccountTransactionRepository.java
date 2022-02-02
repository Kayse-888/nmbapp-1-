package com.kudamachingauta.nmbapp.dao;

import com.kudamachingauta.nmbapp.models.Account;
import com.kudamachingauta.nmbapp.models.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {
    List<AccountTransaction> findAllByAccount(Account account);
}
