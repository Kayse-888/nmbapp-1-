package com.kudamachingauta.nmbapp.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Account {
    private Long id;
    private String accountNumber;
    private Long branchId;
    private String currency;
    private Timestamp dateOfCreation;
    private String mobileNumber;
    private BigDecimal initialBalance;
    private BigDecimal activeBalance;
    private Branch branch;
    private Customer customer;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Basic
    @Column(name = "branch_id")
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @CreationTimestamp
    @Column(name = "date_of_creation")
    public Timestamp getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Timestamp dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Basic
    @Column(name = "mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "initial_balance")
    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }

    @Basic
    @Column(name = "active_balance")
    public BigDecimal getActiveBalance() {
        return activeBalance;
    }

    public void setActiveBalance(BigDecimal activeBalance) {
        this.activeBalance = activeBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(branchId, account.branchId) && Objects.equals(currency, account.currency) && Objects.equals(dateOfCreation, account.dateOfCreation) && Objects.equals(mobileNumber, account.mobileNumber) && Objects.equals(initialBalance, account.initialBalance) && Objects.equals(activeBalance, account.activeBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, branchId, currency, dateOfCreation, mobileNumber, initialBalance, activeBalance);
    }

    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id", nullable = false)
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branchByBranchId) {
        this.branch = branchByBranchId;
    }


    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerByCustomerId) {
        this.customer = customerByCustomerId;
    }
}
