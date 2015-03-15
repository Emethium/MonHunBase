package com.nikolaserafini.MonHunBase.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManager em;

	private JPAUtil() {

	}

	public static EntityManager getEntityManager() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory(
					"$objectdb/db/monhun.odb").createEntityManager();
		}
		return em;
	}
}
