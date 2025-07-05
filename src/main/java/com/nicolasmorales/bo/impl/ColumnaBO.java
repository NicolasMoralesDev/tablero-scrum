package com.nicolasmorales.bo.impl;

import com.nicolasmorales.bo.IColumnaBO;
import com.nicolasmorales.dto.ColumnaDTO;
import com.nicolasmorales.exception.BussinesException;
import com.nicolasmorales.filter.FilterLog;
import com.nicolasmorales.mapper.IColumnaMapper;
import com.nicolasmorales.repository.IColumnaRepository;
import com.nicolasmorales.repository.impl.ColumnaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ColumnaBO implements IColumnaBO {

    private static final Logger LOG = Logger.getLogger(FilterLog.class);

    @Inject
    ColumnaRepository columnaRepository;

    @Inject
    IColumnaMapper columnaMapper;

    @Override
    public List<ColumnaDTO> obtenerColumnas() {
        return columnaRepository.obtenerTodos()
                .stream().map(columna ->
                        columnaMapper.columnaToColumnaDTO(columna)
                ).collect(Collectors.toList());
    }

    @Override
    public List<ColumnaDTO> obtenerColumnasPorTablero(Long tablero) {
        return null;
    }

    @Override
    public Object borrarColumnaPorId(Long id) throws BussinesException {
        try {
            columnaRepository.borrarPorId(id);
        } catch (PersistenceException e) {
            LOG.error(e.getMessage());
            throw new BussinesException("Error al intentar borrar la columna");
        }
        return null;
    }

    @Override
    public ColumnaDTO crearColumna(ColumnaDTO columna) throws BussinesException {
       try {
           columnaRepository.guardar(columnaMapper.columnaDTOToColumna(columna));
           return null;
       } catch (PersistenceException e) {
           throw new BussinesException("Error al intentar registrar la columna");
       }
    }
}
