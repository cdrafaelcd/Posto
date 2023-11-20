package PostoDeSaude.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PostoDeSaude.Entity.Medicos;
import PostoDeSaude.Repository.MedicosRepository;

@Service
public class MedicosService {
	
	@Autowired
	private MedicosRepository medicosRepository;
	
	public List<Medicos> findAll() {
		return medicosRepository.findAll();
	}
	
	public Medicos findById(Long id) {
		Optional<Medicos> obj =  medicosRepository.findById(id);
		return obj.get();
	}

}
