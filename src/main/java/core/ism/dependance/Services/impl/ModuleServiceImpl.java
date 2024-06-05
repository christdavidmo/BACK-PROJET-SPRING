package core.ism.dependance.Services.impl;


import core.ism.dependance.Data.Entity.Module;
import core.ism.dependance.Data.Repository.ModuleRepository;
import core.ism.dependance.Services.ModuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModuleServiceImpl implements ModuleService {
    private  final ModuleRepository moduleRepository;


    @Override
    public Page<Module> findAllModule(Pageable pageable) {
        return moduleRepository.findAllByActiveTrue(pageable);
    }

    @Override
    public Module getAllModuleById(Long id) {

        return moduleRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Module> getModuleByProfesseurId(Long id, Pageable pageable) {

        return moduleRepository.findAllByProfesseurId(id,pageable);
    }
}
