package ma.direction.marinemarchande.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.direction.marinemarchande.dao.CertificationDao;
import ma.direction.marinemarchande.entities.TCertificat;
import ma.direction.marinemarchande.service.CertificationService;


@Service
public class CertificationServiceImpl  implements CertificationService {

	
	@Autowired CertificationDao certificationDao;

	@Override
	public List<TCertificat> findAll() {
		return (List<TCertificat>) certificationDao.findAll();
	}

	@Override
	public void save(TCertificat tc) {
		certificationDao.save(tc);
	}
	
 

}
