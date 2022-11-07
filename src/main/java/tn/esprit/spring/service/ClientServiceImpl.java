package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.DAO.entities.Client;
import tn.esprit.spring.DAO.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService{
	
@Autowired ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		List<Client> clients =(List<Client>) clientRepository.findAll();
		
		
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		return 	clientRepository.save(c);
				
	}

	@Override
	public void deleteClient(Long id) {
			clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		
		return 	clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		return  clientRepository.findById(id).get();
		
	}

}
