package com.hbt.get.client.service.config;

import io.quarkus.arc.Priority;
import io.quarkus.oidc.client.Tokens;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@Priority(Priorities.AUTHENTICATION)
@RequestScoped
@Slf4j
public class OidcClientRequestCustomFilter implements ClientRequestFilter {

    private static final String BEARER = "Bearer ";

    @Inject
    Tokens tokens;

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        log.info("Esta en el filter");
        log.info("Token filter: " + tokens.getAccessToken());
        requestContext.getHeaders().add(HttpHeaders.AUTHORIZATION,
                BEARER + tokens.getAccessToken());
    }
}
