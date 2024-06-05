package core.ism.dependance.Data.Repository;

import core.ism.dependance.Data.Entity.Classe;
import core.ism.dependance.Data.Entity.SessionCours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionCoursRepository extends JpaRepository<SessionCours,Long> {


    Page<SessionCours> findAllByCoursIdAndActiveTrue(Long id , Pageable pageable);
}
