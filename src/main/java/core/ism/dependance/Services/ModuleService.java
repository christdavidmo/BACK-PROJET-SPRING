package core.ism.dependance.Services;

import core.ism.dependance.Data.Entity.Module;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ModuleService {
    Page<Module> findAllModule(Pageable pageable);
    Module getAllModuleById(Long id);
    Page<Module> getModuleByProfesseurId(Long id, Pageable pageable);
}
