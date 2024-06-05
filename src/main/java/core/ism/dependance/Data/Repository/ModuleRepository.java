package core.ism.dependance.Data.Repository;

import core.ism.dependance.Data.Entity.Module;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Long> {

    Optional<Module> findById(Long id);
    Page<Module> findAllByActiveTrue(Pageable pageable);
    Page<Module> findAllByProfesseurId(Long idProfesseur, Pageable pageable);



}
