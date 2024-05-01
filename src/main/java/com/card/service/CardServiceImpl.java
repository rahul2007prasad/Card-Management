package com.card.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.dao.CardDetailsDao;
import com.card.dto.CardDetailsDto;
import com.card.repo.CardRepository;

@Service
public class CardServiceImpl implements ICardService {

	@Autowired
	private CardRepository cardRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CardDetailsDto insertCardDetails(CardDetailsDao cardDetails) {
		// TODO Auto-generated method stub

		
		 CardDetailsDao cardDetailsDao = cardRepository.save(cardDetails);
		 CardDetailsDto cardDetailsDto = modelMapper.map(cardDetailsDao, CardDetailsDto.class);

		return cardDetailsDto;
	}

	@Override
	public CardDetailsDto updateCardDetails(CardDetailsDao cardDetails) {
		CardDetailsDao cardDetailsDao = cardRepository.findById(cardDetails.getCardSerialNumber()).orElseThrow();
		//CardDetailsDto cardDetailsDtoMapped = modelMapper.map(cardDetailsDao, CardDetailsDto.class);
		CardDetailsDao updatedDetails = cardRepository.save(cardDetails);
		CardDetailsDto cardDetailsDtoMapped = modelMapper.map(updatedDetails, CardDetailsDto.class);
		return cardDetailsDtoMapped;
	}

}
