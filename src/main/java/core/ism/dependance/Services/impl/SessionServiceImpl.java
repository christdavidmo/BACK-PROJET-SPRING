package core.ism.dependance.Services.impl;

import core.ism.dependance.Data.Entity.SessionCours;
import core.ism.dependance.Data.Repository.SessionCoursRepository;
import core.ism.dependance.Services.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {

    private final SessionCoursRepository sessionCoursRepository;

    @Override
    public Page<SessionCours> FindAllByCoursIdAndActiveTrue(Long id, Pageable pageable) {

        return sessionCoursRepository.findAllByCoursIdAndActiveTrue(id,pageable);
    }
}
