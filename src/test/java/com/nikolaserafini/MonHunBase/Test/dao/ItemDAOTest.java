package com.nikolaserafini.MonHunBase.Test.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.nikolaserafini.MonHunBase.Objects.Item;
import com.nikolaserafini.MonHunBase.dao.GenericDAO;
import com.nikolaserafini.MonHunBase.dao.ItemDAO;

public class ItemDAOTest {
	
	private GenericDAO<Item> dao;
	private Item item;
	
	public ItemDAOTest() {
		dao = new ItemDAO();
	}
	
	@Before
	public void init() {
		item = new Item(null,"Mace", 1, 50, 2500, 20000);
	}
	
	@Test
	public void test_save_object_and_get_it_back() {
		dao.save(item);
		Item recovered = dao.getById(1);
		assertEquals(item.getName(), recovered.getName());
		assertEquals(item.getMaxAmount(), recovered.getMaxAmount());
	}
	
}
