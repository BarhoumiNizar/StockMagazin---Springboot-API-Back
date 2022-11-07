package tn.esprit.spring.DAO.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	@Temporal (TemporalType.DATE)
	private Date dateNaissance;
	
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	@Enumerated(EnumType.STRING)
	private Profession profession;
	
	@JsonIgnore 
	@OneToMany (mappedBy="client" ,fetch=FetchType.EAGER)
	private Set<Facture> factures;
	
	public Client() {
		// TODO Auto-generated constructor stub
		
	}


	public Client(String nom, String prenom, String email, String password, Date dateNaissance,
			CategorieClient categorieClient, Profession profession) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.categorieClient = categorieClient;
		this.profession = profession;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public CategorieClient getCategorieClient() {
		return categorieClient;
	}



	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}



	public Profession getProfession() {
		return profession;
	}



	public void setProfession(Profession profession) {
		this.profession = profession;
	}



	public Set<Facture> getFactures() {
		return factures;
	}



	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	
	
	
}
