package com.supplies.Serviece;

import com.supplies.DAO.SupplyDAO;
import com.supplies.DTO.SupplyDTO;
import com.supplies.Entity.Supply;
import com.supplies.Repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SupplyService {
    private final SupplyDAO supplyDAO;

    @Autowired
    private SupplyRepository supplyRepository;

    public Supply saveSupply(SupplyDTO supplyDTO){
        Supply supply = new Supply();
        supply.setSupply_id(supplyDTO.getSupply_id());
        supply.setCategory(supplyDTO.getCategory());
        supply.setName(supplyDTO.getName());
        supply.setRecent_date(supplyDTO.getRecent_date());
        supply.setPresent_amount(supply.getPresent_amount());
        supply.setDecription(supplyDTO.getDecription());


    }

    public List<Supply> getAllSupply(){
        return supplyRepository.findAll();
    }
}
