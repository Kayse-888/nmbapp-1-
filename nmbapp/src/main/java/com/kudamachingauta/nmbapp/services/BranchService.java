package com.kudamachingauta.nmbapp.services;

import com.kudamachingauta.nmbapp.models.Branch;

import java.util.List;

public interface BranchService {
    String createBranch(Branch branch);
    String updateBranch(Branch branch);
    String deleteBranch(Long id);
    List<Branch> getAllBranches();
    Branch getBranch(Long id);
    Branch findByBranchCode(String branchCode);
}
