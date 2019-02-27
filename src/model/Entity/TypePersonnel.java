package model.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Personnel")
public class TypePersonnel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45 ,  nullable=true)
	private String nom;
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<NonNavigant> nonNavigants = new ArrayList<>();
	
	@OneToMany(mappedBy = "typePersonnel")
	private List<Navigant> navigants = new ArrayList<>();
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public List<NonNavigant> getNonNavigants() {
		return nonNavigants;
	}

	public void setNonNavigants(List<NonNavigant> nonNavigants) {
		this.nonNavigants = nonNavigants;
	}
	
	public void addNonNavigant(NonNavigant nonNavigants ) {
	 this.nonNavigants.add(nonNavigants);
	}
	
	public List<Navigant> getNavigants() {
		return navigants;
	}
	
	public void setNavigants(List<Navigant> navigants) {
		this.navigants = navigants;
	}
	
	public void addNavigant(Navigant navigants ) {
		 this.navigants.add(navigants);
		}
	
	
}
