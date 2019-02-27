package model.Entity;

import javax.persistence.*;

@Embeddable
public class Contact {


	
	@Column( nullable=true, length = 45)
	private String tel;
	
	@Column( nullable=true)
	private String rue;
	
	@Column( nullable=true)
	private String Ville;
	
	@Column( nullable=true, name = "code_postal")
	private String codePostal;
	
	@Column( nullable=false , unique=true )
	private String mail;

	
	
	
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
	
	
}
