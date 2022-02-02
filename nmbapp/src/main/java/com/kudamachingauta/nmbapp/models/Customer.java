package com.kudamachingauta.nmbapp.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Customer {
    private Long id;
    private String firstName;
    private String surname;
    private String nationalId;
    private String title;
    private Object homeOwner;
    private String email;
    private String username;
    private Object gender;
    private Timestamp creationDate;

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
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "national_id")
    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "home_owner")
    public Object getHomeOwner() {
        return homeOwner;
    }

    public void setHomeOwner(Object homeOwner) {
        this.homeOwner = homeOwner;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "gender")
    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    @Basic
    @CreationTimestamp
    @Column(name = "creation_date")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(surname, customer.surname) && Objects.equals(nationalId, customer.nationalId) && Objects.equals(title, customer.title) && Objects.equals(homeOwner, customer.homeOwner) && Objects.equals(email, customer.email) && Objects.equals(username, customer.username) && Objects.equals(gender, customer.gender) && Objects.equals(creationDate, customer.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, surname, nationalId, title, homeOwner, email, username, gender, creationDate);
    }
}
