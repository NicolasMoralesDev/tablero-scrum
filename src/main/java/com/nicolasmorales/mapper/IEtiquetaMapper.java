package com.nicolasmorales.mapper;

import com.nicolasmorales.dto.EtiquetaDTO;
import com.nicolasmorales.entity.Etiqueta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "jakarta")
public interface IEtiquetaMapper {

    @Mappings({
            @Mapping(target = "id", source = "etiqueta.id"),
            @Mapping(target = "nombre", source = "etiqueta.nombre"),
            @Mapping(target = "borrado", source = "etiqueta.borrado"),
    })
    EtiquetaDTO etiquetaToEtiquetaDTO(Etiqueta etiqueta);

    @Mappings({
            @Mapping(target = "id", source = "etiqueta.id"),
            @Mapping(target = "nombre", source = "etiqueta.nombre"),
            @Mapping(target = "borrado", source = "etiqueta.borrado"),
    })
    Etiqueta etiquetaDTOToEtiqueta(EtiquetaDTO etiqueta);
}
