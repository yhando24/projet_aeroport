package model.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "non_navigant")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class NonNavigant extends Personnel {
	
	@ManyToOne
	@JoinColumn(name="id_type_personnel", nullable = true)
	private TypePersonnel typePersonnel;

	public TypePersonnel getTypePersonnel() {
		return typePersonnel;
	}

	public void setTypePersonnel(TypePersonnel typePersonnel) {
		this.typePersonnel = typePersonnel;
	}
	
	@ManyToMany(mappedBy = "nonNavigants")
	private List<Vol> vols = new ArrayList<>();
	
}
