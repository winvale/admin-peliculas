package ejemplo.servicios.impl;

import ejemplo.commons.GenericServiceImpl;
import ejemplo.daos.PeliculaDao;
import ejemplo.servicios.api.PeliculaService;
import ejemplo.modelos.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends GenericServiceImpl<Pelicula, Integer> implements PeliculaService {
    @Autowired
    private PeliculaDao dao;

    @Override
    public JpaRepository<Pelicula, Integer> getDao() {
        return dao;
    }
}
