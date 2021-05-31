package com.project.bootcamp.bootcamp.controller;

import com.project.bootcamp.bootcamp.model.StockDTO;
import com.project.bootcamp.bootcamp.services.StockService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @Autowired
    private StockService services;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){

        return ResponseEntity.ok(services.save(dto));

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){

        return  ResponseEntity.ok(services.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<List<StockDTO>> findAll(){

       return ResponseEntity.ok(services.findAll());
    }

    @GetMapping(value = "/{id}", produces =MediaType.APPLICATION_JSON_VALUE )
    public  ResponseEntity<StockDTO> findById(@PathVariable Long id){

         return  ResponseEntity.ok(services.findById(id));

    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> delete (@PathVariable Long id){

        return  ResponseEntity.ok(services.delete(id));
    }

    @GetMapping(value = "/today",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findByToday(){

        return  ResponseEntity.ok(services.findByToday());

    }

}
