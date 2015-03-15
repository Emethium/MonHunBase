package com.nikolaserafini.MonHunBase.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nikolaserafini.MonHunBase.Objects.DropProperties;
import com.nikolaserafini.MonHunBase.Objects.Item;
import com.nikolaserafini.MonHunBase.Objects.Location;
import com.nikolaserafini.MonHunBase.Objects.Monster;

public class Objects {
	
	private Item item;
	private DropProperties drop;
	private Location loc;
	
	@Before
	public void initialize() {
		item = new Item(1, "Potion", 1, 10, 7, 1);
		drop = new DropProperties("HR 1","Great Jaggi","Monster Carve","75%");
		loc = new Location("Flooded Forest","HR 1","Area 1","Carve Rocks");
	}
	

	@Test
	public void addLocationToItemListTest() {
		item.addLocation(loc);
		assertNotNull(item.getPlacesFound());
	}
	
	@Test
	public void addVariousLocationsToItemListTest() {
		Location loc2 = new Location("Flooded Forest","HR 1","Area 1","Carve Rocks");
		item.addLocation(loc);
		item.addLocation(loc2);
		assertNotNull(item.getPlacesFound());
	}
	
	@Test
	public void addPropertiesToItemListTest() {
		item.addProperties(drop);
		assertNotNull(item.getCarvedFrom());
	}
	
	@Test
	public void addVariousPropertiesToItemListTest() {
		DropProperties drop2 = new DropProperties("HR 1","Great Jaggi","Monster Carve","75%");
		item.addProperties(drop);
		item.addProperties(drop2);
		assertNotNull(item.getCarvedFrom());
	}
	
	@Test
	public void addElemWeaknessToMonsterList() {
		Monster monster = new Monster("Royal Ludroth");
		monster.addWeakness("fire");
		assertNotNull(monster.getElemWeakness());
	}
	
	@Test
	public void addElemToleranceToMonsterList() {
		Monster monster = new Monster("Great Jaggi");
		monster.addWeakness("water");
		assertNotNull(monster.getElemTolerance());
	}
	
	@Test
	public void addBreakablePartToMonsterList() {
		Monster monster = new Monster("Barroth");
		String s = "Head";
		monster.addBreakable(s);
		assertNotNull(monster.getBreakableParts());
	}
	

}
