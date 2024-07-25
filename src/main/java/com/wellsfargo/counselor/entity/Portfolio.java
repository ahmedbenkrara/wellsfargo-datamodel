package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    @OneToMany(mappedBy = "portfolio" ,cascade = CascadeType.ALL)
    private Set<Security> securities;

    public Portfolio(){}


    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }
}
