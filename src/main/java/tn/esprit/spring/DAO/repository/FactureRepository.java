package tn.esprit.spring.DAO.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.DAO.entities.Client;
import tn.esprit.spring.DAO.entities.Facture;

@Repository 
public interface FactureRepository extends CrudRepository <Facture,Long>{

	
	@Query("SELECT f FROM Facture f WHERE f.client=:c AND f.active=true AND f.montantRemise > :r ")
	List<Facture> factureClientMontant (@Param("c")Client client,@Param("r") Float montantRemise);
	
}
