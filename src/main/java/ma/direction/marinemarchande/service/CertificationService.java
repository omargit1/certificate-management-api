package ma.direction.marinemarchande.service;

import java.util.List;

import ma.direction.marinemarchande.dto.CertificatDto;
import ma.direction.marinemarchande.entities.TCertificat;

/**
 *  Service pour les operations CRUD
 *  
 * @author Omar EL ASSRI
 *
 */

public interface CertificationService {
 
	List<TCertificat> findAll();
	void save(CertificatDto c);
	
}
