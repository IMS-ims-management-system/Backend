package com.backend.supplies.DTO;

import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.ResponseBody;

public class SupplyDTO {
    String name;
    String category;
    int presentAmount;
    String recentDate;
    String decription;


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

