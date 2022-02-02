package com.kudamachingauta.nmbapp.dao;

import com.kudamachingauta.nmbapp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
