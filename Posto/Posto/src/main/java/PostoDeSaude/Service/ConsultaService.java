package PostoDeSaude.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PostoDeSaude.Entity.Consulta;
import PostoDeSaude.Repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository repository;
	
	public List<Consulta> findAll() {
		return repository.findAll();
	}
	
	public Consulta findById(Long id) {
		Optional<Consulta> obj =  repository.findById(id);
		return obj.get();
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public Consulta update(Long id, Consulta obj) {
		Consulta entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Consulta entity, Consulta obj) {
		entity.setMoment(obj.getMoment());
		entity.setConsultaStatus(obj.getConsultaStatus());
		
		
	}

 
}