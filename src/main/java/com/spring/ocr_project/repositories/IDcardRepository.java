package com.spring.ocr_project.repositories;


import com.spring.ocr_project.entities.CarteIdentite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IDcardRepository extends JpaRepository<CarteIdentite, Integer> {

}