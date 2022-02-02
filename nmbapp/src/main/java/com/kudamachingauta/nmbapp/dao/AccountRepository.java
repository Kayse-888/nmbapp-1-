package com.kudamachingauta.nmbapp.dao;

import com.kudamachingauta.nmbapp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountNumber(String accountNumber);
    List<Account> findAllByActiveBalanceGreaterThan(BigDecimal amount);
}
