package com.kudamachingauta.nmbapp.dao;

import com.kudamachingauta.nmbapp.models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    Branch findByBranchCode(String branchCode);
}
