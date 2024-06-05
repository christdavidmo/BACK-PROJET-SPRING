package core.ism.dependance.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import core.ism.dependance.Data.Entity.Classe;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {
    @Override
    Optional<Classe> findById(Long id);
}

