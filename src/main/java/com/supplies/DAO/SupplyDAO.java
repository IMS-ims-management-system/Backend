package com.supplies.DAO;

import com.supplies.Entity.Supply;
import com.supplies.Repository.SupplyRepository;

public class SupplyDAO {
    Supply insertSupply(Supply supply){
        Supply savedSupply = SupplyRepository.save(supply);

        return savedSupply;
    };
}
