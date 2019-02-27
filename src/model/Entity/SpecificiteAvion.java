package model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Specificite_Avion")
public class SpecificiteAvion {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45 ,  nullable=false)
	private String marqie;
	
	@Column(length = 45 ,  nullable=false)
	private String type;
	
	@Column(length = 45 ,  name= "passager_max")
	private int passagerMax;
	
	@Column(length = 45 ,  name= "volume_reservoir")
	private int volumeReservoir;
	
	@Column(length = 45, name= "consoMoyenne")
	private int consoMoyenne;

	@Column(length = 45 ,  name= "surConsomation")
	private int surConsomation;

	public String getMarqie() {
		return marqie;
	}

	public void setMarqie(String marqie) {
		this.marqie = marqie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPassagerMax() {
		return passagerMax;
	}

	public void setPassagerMax(int passagerMax) {
		this.passagerMax = passagerMax;
	}

	public int getVolumeReservoir() {
		return volumeReservoir;
	}

	public void setVolumeReservoir(int volumeReservoir) {
		this.volumeReservoir = volumeReservoir;
	}

	public int getConsoMoyenne() {
		return consoMoyenne;
	}

	public void setConsoMoyenne(int consoMoyenne) {
		this.consoMoyenne = consoMoyenne;
	}

	public int getSurConsomation() {
		return surConsomation;
	}

	public void setSurConsomation(int surConsomation) {
		this.surConsomation = surConsomation;
	}

	public int getId() {
		return id;
	}
	
	
	
	
	
	
}
