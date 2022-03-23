package com.hbt.get.client.service;

import com.hbt.get.client.service.client.AsignacionPinRestClient;
import com.hbt.get.client.service.model.*;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.client.exception.ResteasyWebApplicationException;


import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.core.Response;


@Singleton
@Path("/api")
@Slf4j
public class GreetingResource  {


    @RestClient
    @Inject
    AsignacionPinRestClient asignacionPinRestClient;

    @POST
    @Path("/asignacion")
    public Response getAsignacionPin(@Valid DataAsignacionPin dataAsignacionPin){

        try {
            return Response.ok(asignacionPinRestClient.getAsignacionPIN(dataAsignacionPin)).build();
        }catch (ResteasyWebApplicationException e){



            log.error(e.toString());
            log.error(e.getLocalizedMessage());
            return Response.noContent().build();
        }
    }

}