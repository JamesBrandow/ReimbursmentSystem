package dev.brandow.daotest;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.brandow.daos.ManagerDAO;
import dev.brandow.daos.ManagerDAOMaria;

public class ManagerDAOTest {

	private ManagerDAO mandao = new ManagerDAOMaria();
	
	@Test
	public void retrieveManagerByUsername() {
		System.out.println(mandao.getManagerByUsername("oldman"));
	}

}
