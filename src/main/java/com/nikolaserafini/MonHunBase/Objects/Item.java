package com.nikolaserafini.MonHunBase.Objects;

import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;				// Item ID

	private String portraitSource;			// Portrait image file location
	@Column(nullable = false)
	private String name;				// Item name
	@Column
	private Integer rarity;				// Item rarity : 1 - 10
	@Column
	private Integer maxAmount;			// Max carrying item amount
	@Column
	private Integer buyValue;			// Buying price
	@Column
	private Integer sellValue;			// Selling price
	@OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
	private LinkedList<Location> placesFound;  	// List regarding info of how the item is found
	@OneToMany(mappedBy = "armor", fetch = FetchType.LAZY)
	private LinkedList<DropProperties> howToObtain;	// List regarding info of how the item is dropped from monsters

	/*
	Default constructor
	*/


	public Item(Integer id, String name, Integer rarity,
			Integer maxAmount, Integer buyValue, Integer sellValue) {
		this.id = id;
		this.name = name;
		this.rarity = rarity;
		this.maxAmount = maxAmount;
		this.buyValue = buyValue;
		this.sellValue = sellValue;
		this.placesFound = new LinkedList<Location>();
		this.howToObtain = new LinkedList<DropProperties>();
	}


	/*
	Adding to list methods
	*/

	public boolean addLocation(Location l) {
		if(this.placesFound.add(l))
			return true;
		else
			return false;

	}
	
	public boolean addProperties(DropProperties d) {
		if(this.howToObtain.add(d))
			return true;
		else
			return false;
	}


	/*
	Getters and setters
	*/

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public Integer getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Integer getSellValue() {
		return sellValue;
	}
	public void setSellValue(Integer sellValue) {
		this.sellValue = sellValue;
	}
	public LinkedList<Location> getPlacesFound() {
		return placesFound;
	}
	public void setPlacesFound(LinkedList<Location> placesFound) {
		this.placesFound = placesFound;
	}
	public LinkedList<DropProperties> getCarvedFrom() {
		return howToObtain;
	}
	public void setCarvedFrom(LinkedList<DropProperties> howToObtain) {
		this.howToObtain = howToObtain;
	}


}
