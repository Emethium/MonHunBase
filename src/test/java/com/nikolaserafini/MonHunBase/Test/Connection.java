package com.nikolaserafini.MonHunBase.Test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.nikolaserafini.MonHunBase.util.JPAUtil;

public class Connection {

	@Test
	public void test_create_an_entity_manager() {
		EntityManager em = JPAUtil.getEntityManager();
		assertNotNull(em);		
	}
	
	
}
