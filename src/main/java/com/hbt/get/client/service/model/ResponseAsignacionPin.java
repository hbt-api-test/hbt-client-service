package com.hbt.get.client.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAsignacionPin {

    private int statusCode;
    private Long idConsulta;
    private int codigoRespuesta;
    private String mensajeRespuesta;
    private String fechaConsulta;
    private AsignacionPin datos;

}
