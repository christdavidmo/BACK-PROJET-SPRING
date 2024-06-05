package core.ism.dependance.Services.impl;

import core.ism.dependance.Data.Entity.Professeur;
import core.ism.dependance.Data.Repository.ProfesseurRepository;
import core.ism.dependance.Services.ProfesseurService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfesseurServiceImpl implements ProfesseurService {

    private final ProfesseurRepository professeurRepository;

    @Override
    public Page<Professeur> findAllProfesseurs(Pageable pageable) {

       return professeurRepository.findAll(pageable);
    }
}
