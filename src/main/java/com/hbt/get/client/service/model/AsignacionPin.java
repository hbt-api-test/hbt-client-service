package com.hbt.get.client.service.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignacionPin {

    private String tipoDocumento;
    private String numeroDocumento;
    private String pin;
}
