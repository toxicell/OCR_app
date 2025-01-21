package com.spring.ocr_project;

import com.spring.ocr_project.entities.CarteIdentite;
import com.spring.ocr_project.entities.Passport;
import com.spring.ocr_project.repositories.CarteIdentiteRepository;
import com.spring.ocr_project.repositories.PassportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class OcrProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcrProjectApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(CarteIdentiteRepository repository , PassportRepository passportRepository) {
        return args -> {
            // Sample data
            CarteIdentite card1 = new CarteIdentite();
            card1.setNom("badr");
            card1.setPrenom("John");
            card1.setNumeroCarteNational("C123456789");
            card1.setDateFinCarteNational("12.02.2025");
            card1.setAdresse("123 Main St, Cityville");
            card1.setDateNaissance("12.02.2025");

            CarteIdentite card2 = new CarteIdentite();
            card2.setNom("Smith");
            card2.setPrenom("Jane");
            card2.setNumeroCarteNational("C987654321");
            card2.setDateFinCarteNational("12.02.2025");
            card2.setAdresse("456 Oak Ave, Townsville");
            card2.setDateNaissance("12.02.2025");

            Passport passport = new Passport();
            passport.setNom("omar");
            passport.setPrenom("trey");
            passport.setPassportNumber("VLB5D8F");
            passport.setDateNaissance("12.02.2025");
            passport.setDateDeDeliverance("12.02.2025");
            passport.setDateExpiration("12.02.2025");
            passport.setLieuNaissance("Moscow");
            passport.setNationalite("Russia");

            // Save to database
            repository.save(card1);
            repository.save(card2);
            passportRepository.save(passport);
            System.out.println("Sample data loaded successfully.");
        };
    }

}
