package com.nicolasmorales.dto;

import java.time.LocalDateTime;
import java.util.List;

public record TableroDTO(
         Long id,
         String titulo,
         String descripcion,
         List<ColumnaDTO> columnas,
         LocalDateTime fechaDeCreacion,
         boolean borrado
) {
}
