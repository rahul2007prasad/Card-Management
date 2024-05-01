package com.card.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.card.dao.CardDetailsDao;

public interface CardRepository extends JpaRepository<CardDetailsDao, Long>{

}
