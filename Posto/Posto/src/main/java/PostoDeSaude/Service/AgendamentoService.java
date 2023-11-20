package PostoDeSaude.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PostoDeSaude.Entity.Agendamento;
import PostoDeSaude.Repository.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	public List<Agendamento> findAll() {
		return agendamentoRepository.findAll();
	}
	
	public Agendamento findById(Long id) {
		Optional<Agendamento> obj =  agendamentoRepository.findById(id);
		return obj.get();
	}

}
