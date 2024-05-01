package com.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.card.dao.CardDetailsDao;
import com.card.dto.CardDetailsDto;
import com.card.service.ICardService;

@RestController
@RequestMapping
public class CardController {

	@Autowired
	private ICardService cardService;
	@PostMapping("/insert")
	public ResponseEntity insertCardDetails(@RequestBody CardDetailsDao cardDetails){
		
		System.out.println(cardDetails.getCardName());
		CardDetailsDto insertCardDetails = cardService.insertCardDetails(cardDetails);
		
		return new ResponseEntity<>(insertCardDetails , HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateCardDetails(@RequestBody CardDetailsDao cardDetails) {
		CardDetailsDto updateCardDetails = cardService.updateCardDetails(cardDetails);
		return new ResponseEntity<>(updateCardDetails , HttpStatus.OK);
	}
}
