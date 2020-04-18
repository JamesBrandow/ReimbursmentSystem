package dev.brandow.daos;

import dev.brandow.entities.Manager;

public interface ManagerDAO {
	
	Manager getManagerByUsername(String username);

}
