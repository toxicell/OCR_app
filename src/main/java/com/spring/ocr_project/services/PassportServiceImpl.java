package com.spring.ocr_project.services;

import com.spring.ocr_project.entities.Passport;
import com.spring.ocr_project.repositories.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PassportServiceImpl implements PassportService{


    private final PassportRepository passportRepository;

    @Autowired
    PassportServiceImpl(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    @Override
    public void savePassport(Passport passport) {

        System.out.println("saving passport...");
        passportRepository.save(passport);

        System.out.println("passport saved with id " + passport.getId() +
                " nom " + passport.getNom() +
                " prenom " + passport.getPrenom() +
                " numero de la carte " + passport.getPassportNumber()+
                " Nationality " + passport.getNationalite() +
                " lieu de naissance " + passport.getLieuNaissance() +
                " date de deliverance " + passport.getDateDeDeliverance() +
                " date d'expiration " + passport.getDateExpiration() +
                " Date de Naissance " + passport.getDateNaissance());
    }
}

