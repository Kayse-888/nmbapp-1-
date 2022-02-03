package com.kudamachingauta.nmbapp.services.impl;

import com.kudamachingauta.nmbapp.dao.BranchRepository;
import com.kudamachingauta.nmbapp.models.Branch;
import com.kudamachingauta.nmbapp.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {


    @Autowired
    private BranchRepository branchRepository;


    @Override
    public String createBranch(Branch branch) {
        return null;
    }

    @Override
    public String updateBranch(Branch branch) {
        return null;
    }

    @Override
    public String deleteBranch(Long id) {
        return null;
    }

    @Override
    public List<Branch> getAllBranches() {
        List<Branch> branches = branchRepository.findAll();
        if (branches.isEmpty()){
            throw new EntityNotFoundException("Branches not found.");
        }
        return branches;
    }

    @Override
    public Branch getBranch(Long id) {
        Optional<Branch> branch = branchRepository.findById(id);
        if (!branch.isPresent()){
            throw new EntityNotFoundException("Branch with id ".concat(String.valueOf(id)).concat(" not found"));
        }
        return branch.get();
    }

    @Override
    public Branch findByBranchCode(String branchCode) {
        Branch branch = branchRepository.findByBranchCode(branchCode);
        if (Objects.isNull(branch)){
            throw new EntityNotFoundException("Branch with code ".concat(branchCode).concat(" not found."));
        }
        return branch;
    }
}
