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

	private String portraitSource			//Portrait image file location
	@Column(nullable = false)
	private String name;				// Weapon name
	@Column
	private Integer atkPower;			// Attack damage
	@Column
	private Element element;			// Elemental type
	@Column
	private Element element_sec;		// Secondary elemental type
	@Column
	private Integer elementPower;			// Elemental damage
	@Column
	private Integer elementPower_sec;		// Secondary elemental damage
	@Column
	private String sharpness;			// Sharpness values
	@Column
	private String affinity;				// Weapon affinity
	@Column
	private Integer slots;				// Number of slots
	@OneToMany(mappedBy = "weapon", fetch = FetchType.LAZY)
	private List<Weapon> followingWeaponTree;

	public Weapon(String name, Integer atkPower, String sharpness) {
		super();
		this.name = name;
		this.atkPower = atkPower;
		this.sharpness = sharpness;
	}


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

}
