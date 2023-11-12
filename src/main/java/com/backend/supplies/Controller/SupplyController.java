package com.backend.supplies.Controller;

import com.backend.supplies.DTO.SupplyDTO;
import com.backend.supplies.Serviece.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supply")
public class SupplyController {

    private SupplyService supplyService;

    @Autowired
    public SupplyController(SupplyService supplyService){
        this.supplyService = supplyService;
    }


    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)    // 비품 추가
    public ResponseEntity<String> addSupplies(@RequestBody SupplyDTO supplyDTO ){
        supplyService.saveSupply(supplyDTO);
        System.out.println(supplyDTO.getName());
        return ResponseEntity.ok().body("success");

    }
}
