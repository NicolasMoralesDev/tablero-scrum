package com.nicolasmorales.bo;

import com.nicolasmorales.dto.ColumnaDTO;

import java.util.List;

public interface IColumnaBO {

    List<ColumnaDTO> obtenerColumnas();

    List<ColumnaDTO>  obtenerColumnasPorTablero(Long tablero);
}
