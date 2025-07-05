package com.nicolasmorales.bo.impl;

import com.nicolasmorales.bo.IEtiquetaBO;
import com.nicolasmorales.dto.EtiquetaDTO;
import com.nicolasmorales.filter.FilterLog;
import com.nicolasmorales.mapper.IEtiquetaMapper;
import com.nicolasmorales.repository.impl.EtiquetaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.List;

@ApplicationScoped
public class EtiquetaBO implements IEtiquetaBO  {

    private static final Logger LOG = Logger.getLogger(FilterLog.class);

    @Inject
    EtiquetaRepository etiquetaRepository;

    @Inject
    IEtiquetaMapper etiquetaMapper;

    @Override
    public List<EtiquetaDTO> obtenerEtiquetas() {
        return null;
    }
}
