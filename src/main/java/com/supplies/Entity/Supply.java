package com.supplies.Entity;

import jakarta.persistence.*;

@Entity
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int supply_id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String category;
    @Column(nullable = false)
    int present_amount;
    @Column(nullable = false)
    String recent_date;
    @Column(nullable = true)    // 널 가능
    String decription;

    public int getSupply_id(){
        return supply_id;
    }

    public  void setSupply_id(int supply_id){
        this.supply_id = supply_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPresent_amount() {
        return present_amount;
    }

    public void setPresent_amount(int present_amount) {
        this.present_amount = present_amount;
    }

    public String getRecent_date() {
        return recent_date;
    }

    public void setRecent_date(String recent_date) {
        this.recent_date = recent_date;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
