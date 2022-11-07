package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.DAO.entities.Client;
import tn.esprit.spring.DAO.entities.Facture;
import tn.esprit.spring.service.IClientService;
import tn.esprit.spring.service.IFactureService;

@RestController
public class ClientRestController {
@Autowired 
IClientService clientService;
@Autowired 
IFactureService factureService;

//http://localhost:8089/SpringMVC/retieveAllClient
@GetMapping("/retieveAllClient")
public List<Client> getClient(){
	
	return clientService.retrieveAllClients();
}
//http://localhost:8089/SpringMVC/addClient
@PostMapping("/addClient")
public Client addClient(@RequestBody Client c){
	
	return clientService.addClient(c);
}


@DeleteMapping("/removeClient/{clientId}")
public void removeClient(@PathVariable("clientId") Long id ){
	
	clientService.deleteClient(id);
}
@GetMapping("/retieveFacture/{clientId}/{r}")
List<Facture> factureRemiseClient(@PathVariable("clientId")Long idClient, @PathVariable("r") float remise)
{  
	return factureService.factureClientRemise(idClient, remise);
	}



}
