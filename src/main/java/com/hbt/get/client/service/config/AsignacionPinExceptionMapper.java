package com.hbt.get.client.service.config;

import com.hbt.get.client.service.model.Errores;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Slf4j
@Provider
public class AsignacionPinExceptionMapper implements ResponseExceptionMapper<Errores> {
    @Override
    public Errores toThrowable(Response response) {

        log.info("Title: " + response.readEntity(Errores.class).getTitle());

        return Errores.builder()
                .title(response.readEntity(Errores.class).getTitle())
                .status(response.getStatus())
                .details(response.readEntity(Errores.class).getDetails())
                .type(response.readEntity(Errores.class).getType())
                .instance(response.readEntity(Errores.class).getInstance())
                .build();
    }
}
