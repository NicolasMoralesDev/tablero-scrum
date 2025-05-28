package com.nicolasmorales.dto;

import java.util.List;

public record ColumnaDTO (
        Long id,
        List<TarjetaDTO> tarjetas,
        String titulo,
        boolean borrado
        ){
}
