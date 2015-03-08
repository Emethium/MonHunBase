package com.nikolaserafini.MonHunBase.Objects;

import java.util.LinkedList;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Armor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; // Armor's ID

	@Column(nullable = false)
	private String name; // Name
	@Column
	private Part part; // Defined the body part the armor is equipped
	@Column
	private Integer baseDefense; // Base defense value
	@Column
	private Integer maxDefense; // Maximum defense value
	@Column
	private Integer numberOfSlots; // Number of slots
	@Column
	private Integer rarity; // Rarity value. 1 - 10
	@Column
	private Integer fireResistance; // Fire elemental resistance
	@Column
	private Integer waterResistance; // Water elemental resistance
	@Column
	private Integer iceResistance; // Ice elemental resistance
	@Column
	private Integer thunderResistance; // Thunder elemental resistance
	@Column
	private Integer dragonResistance; // Dragon elemental resistance
	@Column
	private String gender; // Tells the gender that can equip the item
	@Column
	private String hunterType; // Hunter type : Blademaster or Gunner.
	@OneToMany(mappedBy = "armor", fetch = FetchType.LAZY)
	private LinkedList<Item> components; // List of components to craft the
											// item.

	/* Default constructor */

	public Armor(Integer id, String name, Part part, Integer baseDefense,
			Integer maxDefense, Integer numberOfSlots, Integer rarity,
			Integer fireResistance, Integer waterResistance,
			Integer iceResistance, Integer thunderResistance,
			Integer dragonResistance, String gender, String hunterType,
			LinkedList<Item> components) {
		super();
		this.id = id;
		this.name = name;
		this.part = part;
		this.baseDefense = baseDefense;
		this.maxDefense = maxDefense;
		this.numberOfSlots = numberOfSlots;
		this.rarity = rarity;
		this.fireResistance = fireResistance;
		this.waterResistance = waterResistance;
		this.iceResistance = iceResistance;
		this.thunderResistance = thunderResistance;
		this.dragonResistance = dragonResistance;
		this.gender = gender;
		this.hunterType = hunterType;
		this.components = components;
	}

	/* Set the enum defining the item part */

	public boolean defineItemPart(String s) {
		String part = s.toUpperCase();
		try {
			Part p = Part.valueOf(part);
			this.part = p;
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("This part doesn't exist in this game! "
					+ e.getMessage());
			return false;
		}
	}

	/* Add item component to list of components */
	public boolean addComponent(Item item) {
		if (this.components.add(item))
			return true;
		else
			return false;

	}

	/* Getters and setters */

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

	public Integer getMaxDefense() {
		return maxDefense;
	}

	public void setMaxDefense(Integer maxDefense) {
		this.maxDefense = maxDefense;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHunterType() {
		return hunterType;
	}

	public void setHunterType(String hunterType) {
		this.hunterType = hunterType;
	}

}
