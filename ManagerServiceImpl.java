package dev.brandow.services;

import dev.brandow.daos.ManagerDAO;
import dev.brandow.daos.ManagerDAOMaria;
import dev.brandow.entities.Manager;

public class ManagerServiceImpl implements ManagerService{

	private ManagerDAO mdao = new ManagerDAOMaria();
	
	@Override
	public Manager managerLogin(String username) {
		return mdao.getManagerByUsername(username);
		
	}

}
