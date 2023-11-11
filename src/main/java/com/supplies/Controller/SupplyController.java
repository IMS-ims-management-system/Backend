package com.supplies.Controller;

import com.supplies.DTO.SupplyDTO;
import com.supplies.Serviece.SupplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplyController {

    SupplyService supplyService;

    @PostMapping("/save")   // 비품 수량 업뎃
    public ResponseEntity<String> updateSupplies(@RequestBody SupplyDTO supplyDTO){

        
    }

    @PostMapping("/add")    // 비품 추가
    public ResponseEntity<String> addSupplies(@RequestBody SupplyDTO supplyDTO){

        SupplyDTO supplyDTO1 = supplyService.saveSupply(supplyDTO);
    }
}
