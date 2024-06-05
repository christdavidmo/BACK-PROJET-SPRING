package core.ism.dependance.Services;

import core.ism.dependance.Data.Entity.SessionCours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionService {

    Page<SessionCours> FindAllByCoursIdAndActiveTrue(Long id, Pageable pageable);

}
