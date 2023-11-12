package com.backend.supplies.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "supplies_info")
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supply_id")
    int id;
    String name;
    String category;
    @Column(name = "present_amount")
    int presentAmount;
    @Column(name = "recent_date")
    String recentDate;   // 널 가능
    String decription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPresentAmount() {
        return presentAmount;
    }

    public void setPresentAmount(int presentAmount) {
        this.presentAmount = presentAmount;
    }

    public String getRecentDate() {
        return recentDate;
    }

    public void setRecentDate(String recentDate) {
        this.recentDate = recentDate;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
