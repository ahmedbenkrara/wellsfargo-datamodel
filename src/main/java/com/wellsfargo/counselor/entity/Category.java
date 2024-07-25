package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = true)
    private String Description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Security> securities;

    protected Category(){

    }

    public Category(String name, String description) {
        Name = name;
        Description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }
}
