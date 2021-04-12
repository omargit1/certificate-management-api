package ma.direction.marinemarchande.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.direction.marinemarchande.dao.CertificationDao;
import ma.direction.marinemarchande.dto.CertificatDto;
import ma.direction.marinemarchande.entities.TCertificat;
import ma.direction.marinemarchande.service.CertificationService;


@Service
public class CertificationServiceImpl  implements CertificationService {

	
	@Autowired CertificationDao certificationDao;

	@Override
	public List<TCertificat> findAll() {
		return  certificationDao.findAll();
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void save(CertificatDto tca) {
	 
			TCertificat tc = new TCertificat();
			tc.setLibelle("lib"+ tca.getLibelle());
			tc.setDateDebutValidite(new Date());
			 certificationDao.create(tc);
	}
	
 

}
