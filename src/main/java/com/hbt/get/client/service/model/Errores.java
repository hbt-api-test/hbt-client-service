package com.hbt.get.client.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.client.exception.ResteasyWebApplicationException;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Errores extends Exception implements Serializable {

    private static final long serialVersionUID = 8986431324077733106L;
    private String type;
    private String title;
    private int status;
    private List<Details> details;
    private String instance;


}
