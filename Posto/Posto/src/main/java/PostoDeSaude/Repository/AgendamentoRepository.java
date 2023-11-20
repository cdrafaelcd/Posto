package PostoDeSaude.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import PostoDeSaude.Entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

}
