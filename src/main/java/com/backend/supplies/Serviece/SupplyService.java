package com.backend.supplies.Serviece;

import com.backend.supplies.DTO.SupplyDTO;
import com.backend.supplies.Domain.Supply;
import com.backend.supplies.Repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {

    private SupplyRepository supplyRepository;

    @Autowired
    public SupplyService(SupplyRepository supplyRepository){
        this.supplyRepository = supplyRepository;
    }

    public void saveSupply(SupplyDTO supplyDTO){
        Supply supply = new Supply();

        supply.setCategory(supplyDTO.getCategory());
        supply.setName(supplyDTO.getName());
        supply.setRecentDate(supplyDTO.getRecentDate());
        supply.setPresentAmount(supplyDTO.getPresentAmount());
        supply.setDecription(supplyDTO.getDecription());

        supplyRepository.save(supply);
    }

    /*public List<Supply> getAllSupply(){
        return supplyRepository.findAll();
    }*/
}
