package com.card.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CardDetailsDto {


	
	private long cardSerialNumber;
	
	private String cardName;
	
	private String spiFlashStatus;
	
	private String uBootStatus;
	
	private String nandFlashStatus;
	
	private String ddrStatus;
	
	private String eMMCStatus;
	
	private String ethFacePlateStatus;
	
	private String ethbackPlateStatus;
	
	private String kernelStatus;
	
	private String fileSysytemStatus;
	
	private String rebootStatus;
	
	private String location;
	
	private String currentStatus;
	
	
}

