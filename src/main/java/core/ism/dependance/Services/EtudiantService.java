package core.ism.dependance.Services;

import core.ism.dependance.Data.Entity.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EtudiantService {
    Page<Etudiant> getAllEtudiantByClasseId(Long IdClasse, Pageable pageable);

}
