package core.ism.dependance.Services;

import core.ism.dependance.Data.Entity.Professeur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProfesseurService {
    Page<Professeur> findAllProfesseurs(Pageable pageable);

}
