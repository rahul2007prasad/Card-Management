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

		CardDetailsDto cardDetailsDto = modelMapper.map(cardDetails, CardDetailsDto.class);
		CardDetailsDto saveCardDetailsDto = cardRepository.save(cardDetailsDto);

		return saveCardDetailsDto;
	}

	@Override
	public CardDetailsDto updateCardDetails(CardDetailsDao cardDetails) {
		CardDetailsDto cardDetailsDto = cardRepository.findById(cardDetails.getCardSerialNumber()).orElseThrow();
		CardDetailsDto cardDetailsDtoMapped = modelMapper.map(cardDetailsDto, CardDetailsDto.class);
		cardRepository.save(cardDetailsDtoMapped);
		return cardDetailsDtoMapped;
	}

}
