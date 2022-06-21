package io.youse.template.repositories;

import io.youse.template.models.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OficinaRepository extends JpaRepository<Oficina, Long> {
    Optional<Oficina> findById(UUID id);
}
