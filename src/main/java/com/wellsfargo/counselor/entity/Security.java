package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String Name;
    @Column(name = "PurchaseDate", nullable = false)
    private Date Purchase_date;
    @Column(name = "PurchasePrice", nullable = false)
    private float Purchase_price;
    @Column(nullable = false)
    private int Quantity;

    @ManyToOne
    @JoinColumn(name = "Portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "Category_id")
    private Category category;

    protected Security(){

    }

    public Security(String name, Date purchase_date, float purchase_price, int quantity) {
        Name = name;
        Purchase_date = purchase_date;
        Purchase_price = purchase_price;
        Quantity = quantity;
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

    public Date getPurchase_date() {
        return Purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        Purchase_date = purchase_date;
    }

    public float getPurchase_price() {
        return Purchase_price;
    }

    public void setPurchase_price(float purchase_price) {
        Purchase_price = purchase_price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
