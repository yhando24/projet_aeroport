package model.Entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NaturalIdCache
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE)
public class Navigant extends Personnel {

	
	@ManyToOne
	@JoinColumn(name="id_type_personnel", nullable = true)
	private TypePersonnel typePersonnel;

    @OneToMany(mappedBy = "personne" )
	private List<Vol_Navigant> volNavigants = new ArrayList<>();
	
	public TypePersonnel getTypePersonnel() {
		return typePersonnel;
	}

	public void setTypePersonnel(TypePersonnel typePersonnel) {
		this.typePersonnel = typePersonnel;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Navigant navigant = (Navigant) o;
        return Objects.equals(typePersonnel, navigant.typePersonnel);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(typePersonnel);
    }
	
	
}
