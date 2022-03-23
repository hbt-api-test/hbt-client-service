package com.hbt.get.client.service;

import com.hbt.get.client.service.client.AsignacionPinRestClient;
import com.hbt.get.client.service.model.*;
import lombok.extern.slf4j.Slf4j;
import org.decimal4j.util.DoubleRounder;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.client.exception.ResteasyWebApplicationException;
import org.jboss.resteasy.spi.UnhandledException;
import org.w3c.dom.stylesheets.LinkStyle;


import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Singleton
@Path("/api")
@Slf4j
public class GreetingResource  {


    @RestClient
    @Inject
    AsignacionPinRestClient asignacionPinRestClient;

    @POST
    @Path("/asignacion")
    public Response getAsignacionPin(@Valid DataAsignacionPin dataAsignacionPin) throws Errores {

        try {
            return Response.ok(asignacionPinRestClient
                    .getAsignacionPIN(dataAsignacionPin))
                    .build();
        }catch (Errores e){

            ErrorAsignacionPIN ee = ErrorAsignacionPIN.builder()
                    .type(e.getType())
                    .title(e.getTitle())
                    .status(e.getStatus())
                    .details(e.getDetails())
                    .instance(e.getInstance())
                    .build();

            return Response.status(e.getStatus())
                    .entity(ee)
                    .build();
        }

    }

    @GET
    @Path("/number")
    public List<Double> getNumber(){

        Double tasa = 18.39/100;

        List<Double> resultados = new ArrayList<>();

        for (int i = 0 ; i <= 5; i++){
            resultados.add(DoubleRounder.round((tasa*(i + 1))/360, 8));
        }

        return resultados;
    }

}