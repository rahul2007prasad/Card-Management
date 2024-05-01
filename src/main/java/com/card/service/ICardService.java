package com.card.service;

import com.card.dao.CardDetailsDao;
import com.card.dto.CardDetailsDto;

public interface ICardService {

	public CardDetailsDto insertCardDetails(CardDetailsDao cardDetails);
	
	public CardDetailsDto updateCardDetails(CardDetailsDao cardDetails);
	
}
