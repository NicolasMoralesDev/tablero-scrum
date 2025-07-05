package com.nicolasmorales.controller;

import com.nicolasmorales.bo.IEtiquetaBO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/etiqueta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EtiquetaController {

    @Inject
    IEtiquetaBO etiquetaBO;

    @GET
    public Response obtenerEtiquetas() {
        return Response.ok(etiquetaBO.obtenerEtiquetas()).build() ;
    }

}
