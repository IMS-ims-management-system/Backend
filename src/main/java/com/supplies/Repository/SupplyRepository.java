package com.supplies.Repository;

import com.supplies.Entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplyRepository extends JpaRepository<Supply, Integer> {
    List<Supply> findAllBy(int supply_id);
}
