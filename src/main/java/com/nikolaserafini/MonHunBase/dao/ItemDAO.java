package com.nikolaserafini.MonHunBase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.nikolaserafini.MonHunBase.Objects.Item;
import com.nikolaserafini.MonHunBase.util.JPAUtil;

public class ItemDAO implements GenericDAO<Item> {

	@Override
	public List<Item> selectAll() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("select item from Item item", Item.class)
				.getResultList();
	}

	@Override
	public Item getById(Integer id) {
		EntityManager em = JPAUtil.getEntityManager();
		Item item = em.find(Item.class, id);
		return item;
	}

	@Override
	public void update(Item t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Item item) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(item);
		tx.commit();
	}

}
