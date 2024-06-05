package core.ism.dependance.Data.Repository;

import core.ism.dependance.Data.Entity.Cours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {

    Page<Cours> findAllByActiveTrue(Pageable pageable);

    Optional<Cours> findById(Long idCours);
    Page<Cours> findAllByModuleId(Long id, Pageable pageable);

}
