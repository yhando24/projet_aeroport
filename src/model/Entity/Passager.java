package model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passager extends Personne {
	
	
	@Column(length = 45 ,  nullable=true)
	private String nationalite;

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	
	@ManyToOne
	@JoinColumn(name="id_type_personnel", nullable = true)
	private TypePersonnel typePersonnel;
	
}
