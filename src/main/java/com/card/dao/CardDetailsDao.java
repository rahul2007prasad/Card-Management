package com.card.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "card_details")
public class CardDetailsDao {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
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
