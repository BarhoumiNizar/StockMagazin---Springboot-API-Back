package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.DAO.entities.Client;
import tn.esprit.spring.DAO.entities.Facture;
import tn.esprit.spring.DAO.repository.ClientRepository;
import tn.esprit.spring.DAO.repository.FactureRepository;

@Service
public class FactureServiceImpl implements IFactureService {
	@Autowired FactureRepository factureRepository;
	@Autowired ClientRepository clientRepository;
	
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures =(List<Facture>) factureRepository.findAll();
		return factures;
	}

	@Override
	public List<Facture> getFacturesByClient(Long idClient) {
		
		Client c= clientRepository.findById(idClient).get();
		
		return (List<Facture>) c.getFactures();}

	@Override
	public Facture addFacture(Facture f, Long idClient) {
		Client c= clientRepository.findById(idClient).get();
		f.setClient(c);
		
		return 	factureRepository.save(f);
	}

	@Override
	public void cancelFacture(Long id) {
		Facture f=factureRepository.findById(id).get();
		f.setActive(false);
		factureRepository.save(f);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		
		return factureRepository.findById(id).get();
	}

	@Override
	public int nombreFactureByClient(Long id) {
		
		
		return  getFacturesByClient(id).size();
	}

	@Override
	public List<Facture> factureClientRemise(Long idClient, float remise) {
		
		Client c=clientRepository.findById(idClient).get();
		return factureRepository.factureClientMontant(c, remise);
	}


	
	
}
