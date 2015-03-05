package com.nikolaserafini.MonHunBase.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nikolaserafini.MonHunBase.Objects.DropProperties;
import com.nikolaserafini.MonHunBase.Objects.Item;
import com.nikolaserafini.MonHunBase.Objects.Location;
import com.nikolaserafini.MonHunBase.Objects.Monster;

public class Objects {

	@Test
	public void addLocationToItemListTest() {
		Item item = new Item("Potion",1,10,7);
		Location loc = new Location("Flooded Forest","HR 1","Area 1","Carve Rocks");
		item.addLocation(loc);
		assertNotNull(item.getPlacesFound());
	}
	
	@Test
	public void addVariousLocationsToItemListTest() {
		Item item = new Item("Potion",1,10,7);
		Location loc = new Location("Flooded Forest","HR 1","Area 1","Carve Rocks");
		Location loc2 = new Location("Flooded Forest","HR 1","Area 1","Carve Rocks");
		item.addLocation(loc);
		item.addLocation(loc2);
		assertNotNull(item.getPlacesFound());
	}
	
	@Test
	public void addPropertiesToItemListTest() {
		Item item = new Item("Great Jaggi hide",1,10,7);
		DropProperties drop = new DropProperties("HR 1","Great Jaggi","Monster Carve","75%");
		item.addProperties(drop);
		assertNotNull(item.getCarvedFrom());
	}
	
	@Test
	public void addVariousPropertiesToItemListTest() {
		Item item = new Item("Great Jaggi hide",1,10,7);
		DropProperties drop = new DropProperties("HR 1","Great Jaggi","Monster Carve","75%");
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
