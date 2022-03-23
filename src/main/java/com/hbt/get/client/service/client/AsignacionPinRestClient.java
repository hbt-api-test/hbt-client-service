package com.hbt.get.client.service.client;

import com.hbt.get.client.service.model.DataAsignacionPin;
import com.hbt.get.client.service.model.Errores;
import com.hbt.get.client.service.model.ResponseAsignacionPin;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
@RegisterProvider(Errores.class)
public interface AsignacionPinRestClient {

    @POST
    @Path("/AsignacionPin")
    ResponseAsignacionPin getAsignacionPIN(DataAsignacionPin asignacionPin);
}
