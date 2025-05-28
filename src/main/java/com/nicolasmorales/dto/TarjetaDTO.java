package com.nicolasmorales.dto;

import java.time.LocalDateTime;

public record TarjetaDTO(
        Long idTarjeta,
        String titulo,
        String descripcion,
        LocalDateTime fechaDeCreacion,
        boolean borrado
) {
}
