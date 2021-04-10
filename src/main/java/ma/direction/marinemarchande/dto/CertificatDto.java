package ma.direction.marinemarchande.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import ma.direction.marinemarchande.entities.TCertificat;

public class CertificatDto implements Serializable {
	
	private static final long serialVersionUID = 3509208953622145161L;
	
	
	private String libelle;
	private String dateDebutValidite;
	
	
	
	
	public CertificatDto(String libelle, String dateDebutValidite) {
		super();
		this.libelle = libelle;
		this.dateDebutValidite = dateDebutValidite;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDateDebutValidite() {
		return dateDebutValidite;
	}
	public void setDateDebutValidite(String dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}
	public static List<CertificatDto> toDto(List<TCertificat> list) {
		return  list.stream().map(e -> new CertificatDto(e.getLibelle(), e.getDateDebutValidite()+"")).collect(Collectors.toList());
	}
 
	
	

}
