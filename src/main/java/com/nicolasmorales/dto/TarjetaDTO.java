package com.nicolasmorales.dto;

import java.time.LocalDateTime;
import java.util.List;

public record TarjetaDTO(
        Long id,
        String titulo,
        String descripcion,
        List<EtiquetaDTO> etiquetas,
        LocalDateTime fechaDeCreacion,
        boolean borrado
) {
}
