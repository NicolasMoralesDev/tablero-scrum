package com.nicolasmorales.dto;

import java.time.LocalDate;
import java.util.List;

public record TableroDTO(
         Long id,
         String titulo,
         String descripcion,
         List<ColumnaDTO> columnas,
         LocalDate fechaDeCreacion,
         boolean borrado
) {
}
