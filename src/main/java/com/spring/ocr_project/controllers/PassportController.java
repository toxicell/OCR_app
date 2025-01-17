package com.spring.ocr_project.controllers;


import com.spring.ocr_project.entities.CarteIdentite;
import com.spring.ocr_project.entities.Passport;
import com.spring.ocr_project.repositories.PassportRepository;
import com.spring.ocr_project.services.CarteIdentiteService;
import com.spring.ocr_project.services.PassportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class PassportController {

    private final PassportService passportService;


    @Autowired
    public PassportController(PassportService passportService) {
        this.passportService = passportService;
    }

    @PostMapping(path = "/passport")
    public void savePassport(@RequestBody Passport passport) {
        try {
            passportService.savePassport(passport);
            System.out.println("\"CarteIdentite saved successfully: {}\", carteIdentite");
        } catch (Exception e) {
            System.out.println("Error saving CarteIdentite" + e);
            throw new RuntimeException("Error saving CarteIdentite", e);
        }
    }
}
