package ma.direction.marinemarchande.dao.impl;

 
 
import org.springframework.stereotype.Repository;

import ma.direction.marinemarchande.dao.CertificationDao;
import ma.direction.marinemarchande.entities.TCertificat;

@Repository
public class CertificationDaoImpl extends AbstractDaoImpl<TCertificat, Long> implements CertificationDao  {

	public CertificationDaoImpl() {
		super(TCertificat.class);
	}
 
}
