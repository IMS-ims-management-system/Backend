package com.backend.supplies.Repository;

import com.backend.supplies.Domain.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, Integer> {

}
