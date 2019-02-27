package model.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Vol_NavigantId implements Serializable{
		
		// vol = post
	
	    @Column(name = "vol_id")
	    private int volId;
	 
	    @Column(name = "navigant_id")
	    private int navigantId;
	    
	    public Vol_NavigantId() {}
	    
	    public Vol_NavigantId(int vol_id,int navigant_id) {
	        this.volId = vol_id;
	        this.navigantId = navigant_id;
	    }
    
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        Vol_NavigantId that = (Vol_NavigantId) o;
	        return Objects.equals(volId, that.volId) &&
	               Objects.equals(navigantId, that.navigantId);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(volId, navigantId);
	    }
	    
}
