package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FirstName", nullable = false)
    private String First_Name;

    @Column(name = "LastName", nullable = false)
    private String Last_Name;

    @Column(nullable = false)
    private String Phone;

    @ManyToOne
    @JoinColumn(name = "FinancialAdvisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<Portfolio> portfolios;

    protected Client(){

    }

    public Client(String first_Name, String last_Name, String phone) {
        First_Name = first_Name;
        Last_Name = last_Name;
        Phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public Set<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Set<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
