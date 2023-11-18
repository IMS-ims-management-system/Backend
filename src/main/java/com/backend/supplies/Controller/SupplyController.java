package com.backend.supplies.Controller;

import com.backend.supplies.DTO.SupplyUpdateDTO;
import com.backend.supplies.DTO.SupplyAddDTO;
import com.backend.supplies.Domain.Supply;
import com.backend.supplies.Serviece.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supply")
public class SupplyController {

    private SupplyService supplyService;

    @Autowired
    public SupplyController(SupplyService supplyService){
        this.supplyService = supplyService;
    }


    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)    // 비품 추가
    public ResponseEntity<String> addSupplies(@RequestBody SupplyAddDTO supplyAddDTO){
        supplyService.saveSupply(supplyAddDTO);
        System.out.println(supplyAddDTO.getName());
        return ResponseEntity.ok().body("success");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Supply>> allSupplies(){
        return ResponseEntity.ok().body(supplyService.getAllSupply());
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateCount(@RequestBody SupplyUpdateDTO supplyUpdateDTO) {
        supplyService.updateCount(supplyUpdateDTO);
        return ResponseEntity.ok().body("success");
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteSupply(@PathVariable int id){
        supplyService.deleteSupply(id);
        return ResponseEntity.ok().body("success");
    }
}
