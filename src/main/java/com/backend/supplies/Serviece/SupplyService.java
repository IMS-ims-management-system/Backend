package com.backend.supplies.Serviece;

import com.backend.supplies.DTO.SupplyAddDTO;
import com.backend.supplies.DTO.SupplyUpdateDTO;
import com.backend.supplies.Domain.Supply;
import com.backend.supplies.Repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SupplyService {

    private SupplyRepository supplyRepository;

    @Autowired
    public SupplyService(SupplyRepository supplyRepository){
        this.supplyRepository = supplyRepository;
    }

    public void saveSupply(SupplyAddDTO supplyAddDTO){
        Supply supply = new Supply();

        supply.setCategory(supplyAddDTO.getCategory());
        supply.setName(supplyAddDTO.getName());
        supply.setRecentDate(supplyAddDTO.getRecentDate());
        supply.setPresentAmount(supplyAddDTO.getPresentAmount());
        supply.setDecription(supplyAddDTO.getDecription());

        supplyRepository.save(supply);
    }

    public List<Supply> getAllSupply(){
        return supplyRepository.findAll();
    }

    @Transactional
    public void updateCount(SupplyUpdateDTO supplyUpdateDTO){
        int id = supplyUpdateDTO.getId();
        int amount = supplyUpdateDTO.getPresentAmount();

        Optional<Supply> supply = supplyRepository.findById(id);
        supply.ifPresent(value -> value.setPresentAmount(amount));
    }

    public void deleteSupply(int id){
        supplyRepository.deleteById(id);
    }
}
