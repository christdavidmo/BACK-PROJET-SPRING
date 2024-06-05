package core.ism.dependance.Data.Repository;

import core.ism.dependance.Data.Entity.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    Page<Etudiant> findAllByClasseId(Long IdClasse,Pageable pageable);

    @Override
    Page<Etudiant> findAll(Pageable pageable);

}
