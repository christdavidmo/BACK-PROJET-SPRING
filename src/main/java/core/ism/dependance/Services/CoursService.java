package core.ism.dependance.Services;

import core.ism.dependance.Data.Entity.Classe;
import core.ism.dependance.Data.Entity.Cours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Set;

public interface CoursService {

    Page<Cours> findAllCours(Pageable pageable);

    public Set<Classe> getClasseOfCours(Long idCours);
    Page<Cours> getAllCoursByModuleId(Long idModule, Pageable pageable);

}
