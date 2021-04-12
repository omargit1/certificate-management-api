package ma.direction.marinemarchande.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.direction.marinemarchande.dto.CertificatDto;
import ma.direction.marinemarchande.service.CertificationService;



@RestController
public class CertifManagementController {
	
	
	@Autowired CertificationService certificationService;
	

	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<CertificatDto> add(@RequestBody CertificatDto c) {
		
		certificationService.save(c);
		
		return new ResponseEntity<> (c , HttpStatus.CREATED);
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<CertificatDto>> list(){
		
		return new ResponseEntity<> (CertificatDto.toDto(certificationService.findAll()), HttpStatus.OK);
	}
	
}
