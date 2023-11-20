package PostoDeSaude.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PostoDeSaude.Entity.Paciente;
import PostoDeSaude.Repository.PacienteRepository;
import PostoDeSaude.Service.Exceptions.ResourceNotFoundException;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repository;
	
	public List<Paciente> findAll() {
		return repository.findAll();
	}
	
	public Paciente findById(Long id) {
		Optional<Paciente> obj =  repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Paciente insert(Paciente obj) {
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public Paciente update(Long id, Paciente obj) {
		Paciente entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}


	private void updateData(Paciente entity, Paciente obj) {
		entity.setName(obj.getName());
		entity.setEndereço(obj.getEndereço());
		entity.setTelefone(obj.getTelefone());
		
		
	}
}
