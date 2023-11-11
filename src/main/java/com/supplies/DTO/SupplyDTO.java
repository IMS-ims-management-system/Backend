package com.supplies.DTO;

import org.springframework.web.bind.annotation.ResponseBody;

public class SupplyDTO {
    int supply_id;
    String name;

    String category;
    int present_amount;
    String recent_date;
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

