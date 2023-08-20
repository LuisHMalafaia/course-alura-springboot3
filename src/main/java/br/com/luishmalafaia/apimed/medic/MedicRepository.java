package br.com.luishmalafaia.apimed.medic;

import br.com.luishmalafaia.apimed.medic.dto.ListMedicDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicRepository extends JpaRepository<Medic, Long> {
    Page<Medic> findAllByActiveTrue(Pageable pageable);
    Optional<Medic> findByIdAndActiveTrue(Long id);
}
