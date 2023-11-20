package PostoDeSaude.Resource;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PostoDeSaude.Entity.Medicos;
import PostoDeSaude.Service.MedicosService;

@RestController
@RequestMapping(value = "/medicos")
public class MedicosResource {
	
	
	@Autowired
	private MedicosService service;
	
	@GetMapping
	public ResponseEntity<List<Medicos>> findAll() {
		List<Medicos> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Medicos> findById(@PathVariable Long id) {
		Medicos obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

	
	
