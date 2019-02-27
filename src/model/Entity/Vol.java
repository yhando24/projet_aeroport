package model.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Vol {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45 ,  nullable=false)
	private String num_vol;
	
	@Column(length = 45 ,  nullable=false)
	private String ville_depart;
	
	@Column(length = 45 ,  nullable=true)
	private String ville_arrive;
	
	@Column(length = 45 ,  nullable=true)
	private LocalDateTime depart;
	
	
	@Column(length = 45 ,  nullable=true)
	private LocalDateTime arrive;
	
	@Column(length = 45 ,  nullable=false)
	private int distance;
	
	@ManyToMany
	@JoinTable(name = "vol_passager", // nom table de jointure
		        joinColumns = @JoinColumn(name = "id_vol", referencedColumnName="id"), // non de la colonne id de cette object
		        inverseJoinColumns = @JoinColumn(name = "id_passager", referencedColumnName="id") // non de la colonne id de lautre table
		    )
	private List<Passager> passagers = new ArrayList<>();
	
	
    @OneToMany(mappedBy = "vol")
	private List<Vol_Navigant> volNavigants = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "vol_non_navigant", // nom table de jointure
		        joinColumns = @JoinColumn(name = "id_vol", referencedColumnName="id"), // non de la colonne id de cette object
		        inverseJoinColumns = @JoinColumn(name = "id_non_navigant", referencedColumnName="id") // non de la colonne id de lautre table
		    )
	private List<NonNavigant> nonNavigants = new ArrayList<>();
	
	public String getNum_vol() {
		return num_vol;
	}
	
	public void setNum_vol(String num_vol) {
		this.num_vol = num_vol;
	}

	public String getVille_depart() {
		return ville_depart;
	}

	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}

	public String getVille_arrive() {
		return ville_arrive;
	}

	public void setVille_arrive(String ville_arrive) {
		this.ville_arrive = ville_arrive;
	}

	public LocalDateTime getDepart() {
		return depart;
	}

	public void setDepart(LocalDateTime depart) {
		this.depart = depart;
	}

	public LocalDateTime getArrive() {
		return arrive;
	}

	public void setArrive(LocalDateTime arrive) {
		this.arrive = arrive;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
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
	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        Vol vol = (Vol) o;
        return Objects.equals(num_vol, vol.num_vol);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(num_vol);
    }
	
}
