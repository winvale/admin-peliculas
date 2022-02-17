package ejemplo.daos;

import ejemplo.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaDao extends JpaRepository<Pelicula, Integer> {

}
