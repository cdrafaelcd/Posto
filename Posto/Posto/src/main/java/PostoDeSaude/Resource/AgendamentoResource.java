package PostoDeSaude.Resource;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PostoDeSaude.Entity.Agendamento;
import PostoDeSaude.Service.AgendamentoService;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoResource {
	
	
	@Autowired
	private AgendamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Agendamento>> findAll() {
		List<Agendamento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Agendamento> findById(@PathVariable Long id) {
		Agendamento obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

	
	
