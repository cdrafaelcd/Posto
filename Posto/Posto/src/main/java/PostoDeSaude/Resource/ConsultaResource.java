package PostoDeSaude.Resource;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PostoDeSaude.Entity.Consulta;
import PostoDeSaude.Service.ConsultaService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/consulta")
public class ConsultaResource {
	
	
	@Autowired
	private ConsultaService service;
	
	@GetMapping
	public ResponseEntity<List<Consulta>> findAll() {
		List<Consulta> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> findById(@PathVariable Long id) {
		Consulta obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Consulta> update(@PathVariable Long id, @RequestBody Consulta obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
		
	}
	
}

	
	
