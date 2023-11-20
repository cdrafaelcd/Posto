package PostoDeSaude.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import PostoDeSaude.Entity.Medicos;

public interface MedicosRepository extends JpaRepository<Medicos, Long>{

}
