package core.ism.dependance.Data.Repository;

import core.ism.dependance.Data.Entity.Attache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttacheRepository extends JpaRepository<Attache,Long> {
}
