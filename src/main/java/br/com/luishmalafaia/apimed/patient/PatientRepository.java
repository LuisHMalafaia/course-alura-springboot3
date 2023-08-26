package br.com.luishmalafaia.apimed.patient;

import br.com.luishmalafaia.apimed.medic.Medic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findAllByActiveTrue(Pageable pageable);
    Optional<Patient> findByIdAndActiveTrue(Long id);
}
