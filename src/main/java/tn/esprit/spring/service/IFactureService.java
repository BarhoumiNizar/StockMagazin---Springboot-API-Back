package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.DAO.entities.Facture;

public interface IFactureService {
	List<Facture> retrieveAllFactures();

	List<Facture> getFacturesByClient(Long idClient);

	Facture addFacture(Facture f, Long idClient);

	void cancelFacture(Long id);

	Facture retrieveFacture(Long id);
	
	int nombreFactureByClient(Long id);
	
	List<Facture> factureClientRemise(Long idClient,float remise);
	
}
