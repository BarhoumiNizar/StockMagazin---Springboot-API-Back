package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.DAO.entities.Client;

public interface IClientService {
	
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
}
