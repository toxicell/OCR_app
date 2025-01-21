package com.spring.ocr_project.controllers;


import com.spring.ocr_project.entities.CarteIdentite;
import com.spring.ocr_project.services.CarteIdentiteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
@Slf4j
public class CarteIdentiteController {

    private final CarteIdentiteService carteIdentiteService;

    @Autowired
    public CarteIdentiteController(CarteIdentiteService carteIdentiteService) {
        this.carteIdentiteService = carteIdentiteService;
    }

    @PostMapping(path = "/carteIdentite")
    public void saveCarteIdentite(@RequestBody CarteIdentite carteIdentite) {
        try {
            carteIdentiteService.saveCarteIdentite(carteIdentite);
            System.out.println("\"CarteIdentite saved successfully: {}\", carteIdentite");
        } catch (Exception e) {
            System.out.println("Error saving CarteIdentite" + e);
            throw new RuntimeException("Error saving CarteIdentite", e);
        }
    }
}
