package ec.edu.fuelpaz.demo.repository;

import ec.edu.fuelpaz.demo.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {

}
