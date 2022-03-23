package com.hbt.get.client.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Details {

    private String nombreCampo;
    private String tipoError;
    private String descripcion;

}
