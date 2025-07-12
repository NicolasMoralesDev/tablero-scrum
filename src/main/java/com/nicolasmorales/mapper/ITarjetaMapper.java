package com.nicolasmorales.mapper;

import com.nicolasmorales.dto.TarjetaDTO;
import com.nicolasmorales.entity.Tarjeta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "jakarta")
public interface ITarjetaMapper {

    @Mappings({
            @Mapping(target = "idTarjeta", source = "tarjeta.id"),
            @Mapping(target = "titulo", source = "tarjeta.titulo"),
            @Mapping(target = "descripcion", source = "tarjeta.descripcion"),
            @Mapping(target = "fechaDeCreacion", source = "tarjeta.fechaDeCreacion"),
            @Mapping(target = "borrado", source = "tarjeta.borrado"),
    })
    TarjetaDTO tarjetaToTarjetaDTO(Tarjeta tarjeta);

    @Mappings({
            @Mapping(target = "id", source = "tarjeta.idTarjeta"),
            @Mapping(target = "titulo", source = "tarjeta.titulo"),
            @Mapping(target = "descripcion", source = "tarjeta.descripcion"),
            @Mapping(target = "fechaDeCreacion", source = "tarjeta.fechaDeCreacion"),
            @Mapping(target = "borrado", source = "tarjeta.borrado"),
    })
    Tarjeta tarjetaDTOToTarjeta(TarjetaDTO tarjeta);
}
