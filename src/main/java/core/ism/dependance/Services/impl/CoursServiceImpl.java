package core.ism.dependance.Services.impl;

import core.ism.dependance.Data.Entity.Classe;
import core.ism.dependance.Data.Entity.Cours;
import core.ism.dependance.Data.Repository.CoursRepository;
import core.ism.dependance.Services.CoursService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CoursServiceImpl implements CoursService {

    private  final CoursRepository coursRepository ;

    @Override
    public Page<Cours> findAllCours(Pageable pageable) {

        return coursRepository.findAllByActiveTrue(pageable);
    }

    @Override
    public Set<Classe> getClasseOfCours(Long idCours) {

        Cours cours = coursRepository.findById(idCours).orElseThrow( () -> new RuntimeException("existe pas") );

        return cours.getClasses();
    }

    @Override
    public Page<Cours> getAllCoursByModuleId(Long idModule, Pageable pageable) {

        return coursRepository.findAllByModuleId(idModule,pageable);
    }
}
