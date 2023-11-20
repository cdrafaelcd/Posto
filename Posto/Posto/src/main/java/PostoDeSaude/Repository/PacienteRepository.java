package PostoDeSaude.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import PostoDeSaude.Entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
