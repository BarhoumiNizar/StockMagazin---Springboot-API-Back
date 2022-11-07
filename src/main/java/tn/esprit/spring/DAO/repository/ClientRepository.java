package tn.esprit.spring.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.DAO.entities.Client;

@Repository 
public interface ClientRepository extends CrudRepository<Client,Long>  {

}
