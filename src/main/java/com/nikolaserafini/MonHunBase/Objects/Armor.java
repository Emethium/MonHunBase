package com.nikolaserafini.MonHunBase.Objects;

import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Armor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	@Column
	private Part part;
	@Column
	private Integer baseDefense;
	@Column
	private Integer numberOfSlots;
	@Column
	private Integer rarity;
	@Column
	private Integer price;
	@Column
	private Integer fireResistance;
	@Column
	private Integer waterResistance;
	@Column
	private Integer iceResistance;
	@Column
	private Integer thunderResistance;
	@Column
	private Integer dragonResistance;
	@OneToMany(mappedBy = "armor", fetch = FetchType.LAZY)
	private LinkedList<Item> components;
	
	
	public Armor(String name, Integer baseDefense, Integer numberOfSlots,
			Integer rarity, Integer price, Integer fireResistance,
			Integer waterResistance, Integer iceResistance,
			Integer thunderResistance, Integer dragonResistance) {

		this.name = name;
		this.baseDefense = baseDefense;
		this.numberOfSlots = numberOfSlots;
		this.rarity = rarity;
		this.price = price;
		this.fireResistance = fireResistance;
		this.waterResistance = waterResistance;
		this.iceResistance = iceResistance;
		this.thunderResistance = thunderResistance;
		this.dragonResistance = dragonResistance;
		this.components = new LinkedList<Item>();
	}
	
	public boolean defineItemPart(String s) {
		String part = s.toUpperCase();
		try {
			Part p = Part.valueOf(part);
			this.part = p;
			return true;
		} catch(IllegalArgumentException e) {
			System.out.println("This part doesn't exist in this game! " + e.getMessage());
			return false;
		}
	}
	
	public boolean addComponent(Item item) {
		if(this.components.add(item))
			return true;
		else
			return false;
			
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public Integer getBaseDefense() {
		return baseDefense;
	}
	public void setBaseDefense(Integer baseDefense) {
		this.baseDefense = baseDefense;
	}
	public Integer getNumberOfSlots() {
		return numberOfSlots;
	}
	public void setNumberOfSlots(Integer numberOfSlots) {
		this.numberOfSlots = numberOfSlots;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getFireResistance() {
		return fireResistance;
	}
	public void setFireResistance(Integer fireResistance) {
		this.fireResistance = fireResistance;
	}
	public Integer getWaterResistance() {
		return waterResistance;
	}
	public void setWaterResistance(Integer waterResistance) {
		this.waterResistance = waterResistance;
	}
	public Integer getIceResistance() {
		return iceResistance;
	}
	public void setIceResistance(Integer iceResistance) {
		this.iceResistance = iceResistance;
	}
	public Integer getThunderResistance() {
		return thunderResistance;
	}
	public void setThunderResistance(Integer thunderResistance) {
		this.thunderResistance = thunderResistance;
	}
	public Integer getDragonResistance() {
		return dragonResistance;
	}
	public void setDragonResistance(Integer dragonResistance) {
		this.dragonResistance = dragonResistance;
	}
	public LinkedList<Item> getComponents() {
		return components;
	}
	public void setComponents(LinkedList<Item> components) {
		this.components = components;
	}
	
}
