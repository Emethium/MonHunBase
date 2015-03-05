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
public class Weapon {
	private enum Element {
		FIRE,WATER,ICE,THUNDER,POISON,DRAGON,NULL
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	@Column
	private Integer atkPower;
	@Column
	private Element element;
	@Column
	private Integer elementPower;
	@Column
	private String sharpeness;
	@OneToMany(mappedBy = "weapon", fetch = FetchType.LAZY)
	private List<Weapon> followingWeaponTree;
	
	public Weapon(String name, Integer atkPower, String sharpness) {
		this.name = name;
		this.atkPower = atkPower;
		this.sharpeness = sharpness;
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
	public String getSharpeness() {
		return sharpeness;
	}
	public void setSharpeness(String sharpeness) {
		this.sharpeness = sharpeness;
	}
	public List<Weapon> getFollowingWeaponTree() {
		return followingWeaponTree;
	}
	public void setFollowingWeaponTree(List<Weapon> followingWeaponTree) {
		this.followingWeaponTree = followingWeaponTree;
	}
	
}
