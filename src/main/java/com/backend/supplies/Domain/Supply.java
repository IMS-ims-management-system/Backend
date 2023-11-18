package com.backend.supplies.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
