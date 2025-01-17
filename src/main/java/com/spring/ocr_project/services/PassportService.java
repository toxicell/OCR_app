package com.spring.ocr_project.services;


import com.spring.ocr_project.entities.Passport;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {


     void savePassport(Passport passport);
}
