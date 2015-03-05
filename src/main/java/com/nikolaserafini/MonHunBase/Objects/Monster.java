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
public class Monster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	@OneToMany(mappedBy = "monster", fetch = FetchType.LAZY)
	private LinkedList<Element> elemWeakness;
	@OneToMany(mappedBy = "monster", fetch = FetchType.LAZY)
	private LinkedList<Element> elemTolerance;
	@OneToMany(mappedBy = "monster", fetch = FetchType.LAZY)
	private LinkedList<String> breakableParts;
	@OneToMany(mappedBy = "monster", fetch = FetchType.LAZY)
	private LinkedList<Item> carvableItems;
	
	public Monster(String monName) {
		this.name = monName;
		this.elemWeakness = new LinkedList<Element>();
		this.elemTolerance = new LinkedList<Element>();
		this.breakableParts = new LinkedList<String>();
		this.carvableItems = new LinkedList<Item>();
	}
	
	
	public boolean addWeakness(String w) {
		String weakness = w.toUpperCase();
		try {
			Element e = Element.valueOf(weakness);
			this.elemWeakness.add(e);
			return true;
		} catch(IllegalArgumentException e) {
			System.out.println("The element doesn't exist in this game! " + e.getMessage());
			return false;
		}
	}
	public boolean addTolerance(String t) {
		String tolerance = t.toUpperCase();
		try {
			Element e = Element.valueOf(tolerance);
			this.elemTolerance.add(e);
			return true;
		} catch(IllegalArgumentException e) {
			System.out.println("The element doesn't exist in this game! " + e.getMessage());
			return false;
		}
	}
	public boolean addBreakable(String b) {
		if(this.breakableParts.add(b))
			return true;
		else
			return false;
	}
	public boolean addCarvable(Item item) {
		if(this.carvableItems.add(item))
			return true;
		else
			return false;
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
	public LinkedList<Element> getElemWeakness() {
		return elemWeakness;
	}
	public void setElemWeakness(LinkedList<Element> elemWeakness) {
		this.elemWeakness = elemWeakness;
	}
	public LinkedList<Element> getElemTolerance() {
		return elemTolerance;
	}
	public void setElemTolerance(LinkedList<Element> elemTolerance) {
		this.elemTolerance = elemTolerance;
	}
	public LinkedList<String> getBreakableParts() {
		return breakableParts;
	}
	public void setBreakableParts(LinkedList<String> breakableParts) {
		this.breakableParts = breakableParts;
	}
	public LinkedList<Item> getCarvableItems() {
		return carvableItems;
	}
	public void setCarvableItems(LinkedList<Item> carvableItems) {
		this.carvableItems = carvableItems;
	}
	
	
}
