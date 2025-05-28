package com.nicolasmorales.bo.impl;

import com.nicolasmorales.bo.IColumnaBO;
import com.nicolasmorales.dto.ColumnaDTO;
import com.nicolasmorales.mapper.IColumnaMapper;
import com.nicolasmorales.repository.ColumnaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ColumnaBO implements IColumnaBO {

    @Inject
    ColumnaRepository columnaRepository;

    @Inject
    IColumnaMapper columnaMapper;

    @Override
    public List<ColumnaDTO> obtenerColumnas() {
        return columnaRepository.listAll()
                .stream().map( columna ->
                        columnaMapper.columnaToColumnaDTO(columna)
                ).collect(Collectors.toList());
    }

    @Override
    public List<ColumnaDTO> obtenerColumnasPorTablero(Long tablero) {
        return null;
    }
}
