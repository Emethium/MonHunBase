package com.nikolaserafini.MonHunBase.Objects;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Weapon extends Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;				// Weapon id

	private String portraitSource;			//Portrait image file location
	@Column(nullable = false)
	private String name;				// Weapon name
	@Column
	private Integer atkPower;			// Attack damage
	@Column
	private Element element;			// Elemental type
	@Column
	private Element elementSec;			// Secondary elemental type
	@Column
	private Integer elementPower;			// Elemental damage
	@Column
	private Integer elementPowerSec;		// Secondary elemental damage
	@Column
	private String sharpness;			// Sharpness values
	@Column
	private String affinity;				// Weapon affinity
	@Column
	private Integer slots;				// Number of slots
	@Column
	private int defense;				// Weapon defense value
	@Column
	private String recoil;				// Recoils if bowgun
	@Column
	private String reloadSpeed;			// Reload speed if bowgun
	@Column
	private String deviation;				// Deviation if bowgun
	@Column
	private String ammo;				// Ammo type if bowgun
	@Column
	private String hornNotes;			// Horn notes if Hunting Horn
	@Column
	private String charges;				// Charge levels if Bow
	@Column
	private String coatings;				// Coating types if Bow
	@OneToMany(mappedBy = "weapon", fetch = FetchType.LAZY)
	private List<Weapon> followingWeaponTree;   //TODO think of this attribute again

	/*
	Default constructor
	*/
	
	public Weapon(Integer id, String name, Integer rarity, Integer maxAmount,
			Integer buyValue, Integer sellValue, Integer id2,
			String portraitSource, String name2, Integer atkPower,
			Element element, Element elementSec, Integer elementPower,
			Integer elementPowerSec, String sharpness, String affinity,
			Integer slots, int defense, String recoil, String reloadSpeed,
			String deviation, String ammo, String hornNotes, String charges,
			String coatings, List<Weapon> followingWeaponTree) {
		super(id, name, rarity, maxAmount, buyValue, sellValue);
		id = id2;
		this.portraitSource = portraitSource;
		name = name2;
		this.atkPower = atkPower;
		this.element = element;
		this.elementSec = elementSec;
		this.elementPower = elementPower;
		this.elementPowerSec = elementPowerSec;
		this.sharpness = sharpness;
		this.affinity = affinity;
		this.slots = slots;
		this.defense = defense;
		this.recoil = recoil;
		this.reloadSpeed = reloadSpeed;
		this.deviation = deviation;
		this.ammo = ammo;
		this.hornNotes = hornNotes;
		this.charges = charges;
		this.coatings = coatings;
		this.followingWeaponTree = followingWeaponTree;
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
	public Integer getAtkPower() {
		return atkPower;
	}
	public void setAtkPower(Integer atkPower) {
		this.atkPower = atkPower;
	}
	public Element getElement() {
		return element;
	}
	public void setElement(Element element) {
		this.element = element;
	}
	public Integer getElementPower() {
		return elementPower;
	}
	public void setElementPower(Integer elementPower) {
		this.elementPower = elementPower;
	}
	public String getSharpness() {
		return sharpness;
	}
	public void setSharpness(String sharpeness) {
		this.sharpness = sharpeness;
	}
	public List<Weapon> getFollowingWeaponTree() {
		return followingWeaponTree;
	}
	public void setFollowingWeaponTree(List<Weapon> followingWeaponTree) {
		this.followingWeaponTree = followingWeaponTree;
	}
	public String getPortraitSource() {
		return portraitSource;
	}
	public void setPortraitSource(String portraitSource) {
		this.portraitSource = portraitSource;
	}
	public Element getElementSec() {
		return elementSec;
	}
	public void setElementSec(Element elementSec) {
		this.elementSec = elementSec;
	}
	public Integer getElementPowerSec() {
		return elementPowerSec;
	}
	public void setElementPowerSec(Integer elementPowerSec) {
		this.elementPowerSec = elementPowerSec;
	}
	public String getAffinity() {
		return affinity;
	}
	public void setAffinity(String affinity) {
		this.affinity = affinity;
	}
	public Integer getSlots() {
		return slots;
	}
	public void setSlots(Integer slots) {
		this.slots = slots;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public String getRecoil() {
		return recoil;
	}
	public void setRecoil(String recoil) {
		this.recoil = recoil;
	}
	public String getReloadSpeed() {
		return reloadSpeed;
	}
	public void setReloadSpeed(String reloadSpeed) {
		this.reloadSpeed = reloadSpeed;
	}
	public String getDeviation() {
		return deviation;
	}
	public void setDeviation(String deviation) {
		this.deviation = deviation;
	}
	public String getAmmo() {
		return ammo;
	}
	public void setAmmo(String ammo) {
		this.ammo = ammo;
	}
	public String getHornNotes() {
		return hornNotes;
	}
	public void setHornNotes(String hornNotes) {
		this.hornNotes = hornNotes;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getCoatings() {
		return coatings;
	}
	public void setCoatings(String coatings) {
		this.coatings = coatings;
	}
	


}
