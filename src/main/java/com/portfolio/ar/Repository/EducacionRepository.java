package com.portfolio.ar.Repository;

import com.portfolio.ar.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ariel
 */
@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
     public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}