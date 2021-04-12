package ma.direction.marinemarchande.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table (name = "T_CERTIFICAT")
public class TCertificat {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE , generator = "sequence-generator")
	@GenericGenerator(
			name= "sequence-generator", 
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
			parameters = {
			@Parameter( name= "sequence_name", value = "seq_id_certificat"),
			@Parameter(name = "initial_value", value = "1"),
	        @Parameter(name = "increment_size", value = "1")
	})
	@Column(name = "ID_CERTIFICAT")
    private Long id;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	@Column(name = "DATE_DEBUT_VALIDITE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebutValidite;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateDebutValidite() {
		return dateDebutValidite;
	}

	public void setDateDebutValidite(Date dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

}
