package com.spring.ocr_project.services;

import com.spring.ocr_project.entities.CarteIdentite;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CarteIdentiteService {


     CarteIdentite getCarteIdentite(int id);
     List<CarteIdentite> getAllCarteIdentite();
     void deleteCarteIdentite(int id);
     void saveCarteIdentite(CarteIdentite carteIdentite);
}
