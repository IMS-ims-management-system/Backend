package com.backend.supplies.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplyAddDTO {
    String name;
    String category;
    int presentAmount;
    String recentDate;
    String decription;
}

