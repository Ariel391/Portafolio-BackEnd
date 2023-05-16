package com.portfolio.ar.Repository;

import com.portfolio.ar.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ariel
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
