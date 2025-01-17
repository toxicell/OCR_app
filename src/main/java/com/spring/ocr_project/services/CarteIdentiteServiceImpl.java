package com.spring.ocr_project.services;

import com.spring.ocr_project.entities.CarteIdentite;
import com.spring.ocr_project.repositories.CarteIdentiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteIdentiteServiceImpl implements CarteIdentiteService {

    private final CarteIdentiteRepository carteIdentiteRepository;

    @Autowired
    public CarteIdentiteServiceImpl(CarteIdentiteRepository carteIdentiteRepository) {
        this.carteIdentiteRepository = carteIdentiteRepository;
    }

    @Override
    public CarteIdentite getCarteIdentite(int id) {
        return null;
    }

    @Override
    public List<CarteIdentite> getAllCarteIdentite() {
        return carteIdentiteRepository.findAll();
    }

    @Override
    public void deleteCarteIdentite(int id) {
        carteIdentiteRepository.deleteById(id);
    }

    @Override
    public void saveCarteIdentite(CarteIdentite carteIdentite) {
        System.out.println("saving carteIdentite...");
        carteIdentiteRepository.save(carteIdentite);
        System.out.println("carteIdentite saved with id " + carteIdentite.getId() +
                " nom " + carteIdentite.getNom() +
                " prenom " + carteIdentite.getPrenom() +
                " numero de la carte " + carteIdentite.getNumeroCarteNational() +
                " fin carte " + carteIdentite.getDateFinCarteNational());
    }
}
