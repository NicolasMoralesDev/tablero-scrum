package com.nicolasmorales.bo.impl;

import com.nicolasmorales.bo.ITableroBO;
import com.nicolasmorales.dto.TableroDTO;
import com.nicolasmorales.entity.Tablero;
import com.nicolasmorales.exception.BussinesException;
import com.nicolasmorales.mapper.ITableroMapper;
import com.nicolasmorales.repository.impl.TableroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.Transactional;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TableroBO implements ITableroBO {

    private static final Logger LOG = Logger.getLogger(TableroBO.class);

    @Inject
    TableroRepository tableroRepository;

    @Inject
    ITableroMapper tableroMapper;

    @Override
    public List<TableroDTO> obtenerTableros() {
        return tableroRepository.obtenerTodos().stream().map(
                tablero -> tableroMapper.tableroToTableroDTO(tablero)
        ).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public Object borrarTableroPorId(Long id) throws BussinesException {
        try {
            Tablero tablero = tableroRepository.obtenerPorId(id);
            tablero.setBorrado(true);
        } catch (PersistenceException e) {
            LOG.error(e);
            throw new BussinesException("Error al intentar borrar el tablero con id: "+ id);
        }
        return null;
    }

    @Override
    public TableroDTO crearTablero(TableroDTO tableroDTO) throws BussinesException {
        try {
            tableroRepository.guardar(tableroMapper.tableroDTOToTablero(tableroDTO));
            return tableroDTO;
        } catch (PersistenceException e) {
            throw new BussinesException("Error al intentar crear el tablero");
        }
    }
}
