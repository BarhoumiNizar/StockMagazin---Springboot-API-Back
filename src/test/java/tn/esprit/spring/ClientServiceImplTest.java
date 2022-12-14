package tn.esprit.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.service.IClientService;


@RunWith (SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {

	@Autowired
	IClientService clientService;
	@Test
	public void testRetrieveAllClients() {
		assertNotNull(clientService.retrieveAllClients());
	}
	
	
}
