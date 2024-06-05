package core.ism.dependance.Services.impl;

import core.ism.dependance.Data.Entity.Etudiant;
import core.ism.dependance.Data.Repository.EtudiantRepository;
import core.ism.dependance.Services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {


    @Override
    public Page<Etudiant> getAllEtudiantByClasseId(Long IdClasse, Pageable pageable) {
        return null;
    }
}
