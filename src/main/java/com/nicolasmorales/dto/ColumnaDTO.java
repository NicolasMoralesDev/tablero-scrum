package com.nicolasmorales.dto;

import java.util.List;

public record ColumnaDTO (
        Long id,
        List<TarjetaDTO> tarjetas,
        TableroDTO tablero,
        String titulo,
        boolean borrado
        ){
}
