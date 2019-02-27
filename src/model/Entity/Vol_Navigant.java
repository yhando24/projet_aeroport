package model.Entity;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name = "Vol_Navigant")
public class Vol_Navigant {

	 @EmbeddedId
	 private Vol_NavigantId id;
	
	 @ManyToOne
	 @MapsId("volId")
	 private Vol vol;
	 
	 @ManyToOne
	 @MapsId("navigantId")
	 private Personne personne;
	 
	 @Column(name = "prime")
	 private BigDecimal prime;
	 
	 
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        Vol_Navigant that = (Vol_Navigant) o;
	        return Objects.equals(vol, that.vol) &&
	               Objects.equals(personne, that.personne);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(vol, personne);
	    }
	 
	 
}
