package com.nicolasmorales.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class BussinesExceptionMapper implements ExceptionMapper<BussinesException> {
    @Override
    public Response toResponse(BussinesException exception) {
        return Response.status(400).entity(exception.getMessage()).build();
    }
}
