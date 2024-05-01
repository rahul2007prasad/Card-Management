package com.card.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.card.dto.CardDetailsDto;

public interface CardRepository extends JpaRepository<CardDetailsDto, Long>{

}
