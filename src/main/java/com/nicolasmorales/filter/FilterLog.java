package com.nicolasmorales.filter;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import org.jboss.logging.Logger;

import java.io.IOException;

@Provider
public class FilterLog implements ContainerResponseFilter {

    private static final Logger LOG = Logger.getLogger(FilterLog.class);

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        printLog(requestContext);
    }

    /**
     * Imprimimos la informacion de la request por logs
     * @param requestContext request interceptada
     */
    public void printLog(ContainerRequestContext requestContext) {
        LOG.info( requestContext.getMethod() + " " + requestContext.getUriInfo().getPath() );
    }
}
