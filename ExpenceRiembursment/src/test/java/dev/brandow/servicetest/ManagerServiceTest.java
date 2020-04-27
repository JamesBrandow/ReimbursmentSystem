package dev.brandow.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.brandow.services.ManagerService;
import dev.brandow.services.ManagerServiceImpl;

public class ManagerServiceTest {

	ManagerService mserv = new ManagerServiceImpl();
	
	@Test
	public void test() {
		System.out.println(mserv.managerLogin("oldman"));
	}

}
