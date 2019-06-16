package com.devteam.backend.gestvet.controller;

import com.devteam.backend.gestvet.model.Drug;
import com.devteam.backend.gestvet.security.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/gestvet/drugs"})
public class DrugController {
    @Autowired
    private DrugService drugService;

    @PostMapping
    public Drug create(@RequestBody Drug drug){
        return drugService.create(drug);
    }

    @GetMapping(path = {"/{id}"})
    public Drug update(@PathVariable("id") Long id, @RequestBody Drug drug){
        return drugService.update(drug);
    }

    @DeleteMapping(path = {"/{id}"})
    public Drug delete(@PathVariable("id") Long id){
        return drugService.delete(id);
    }

    @GetMapping
    public List<Drug> findAll(){
        return drugService.findAll();
    }
}