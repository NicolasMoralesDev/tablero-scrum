package com.nicolasmorales.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.HashMap;

@Provider
public class BussinesExceptionMapper implements ExceptionMapper<BussinesException> {
    @Override
    public Response toResponse(BussinesException exception) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("msg", exception.getMessage());
        return Response.status(400).entity(msg).build();
    }
}
