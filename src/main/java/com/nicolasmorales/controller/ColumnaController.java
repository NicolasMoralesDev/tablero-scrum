package com.nicolasmorales.controller;

import com.nicolasmorales.bo.IColumnaBO;
import com.nicolasmorales.dto.ColumnaDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/columnas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ColumnaController {

    @Inject
    IColumnaBO columnaBO;

    @GET
    public Response obtenerColumnas() {
        return Response.ok(columnaBO.obtenerColumnas()).build() ;
    }

    @GET
    public Response obtenerColumnasPorTablero(@QueryParam(value = "tablero") Long tablero) {
        return Response.ok(columnaBO.obtenerColumnasPorTablero(tablero)).build() ;
    }

}
