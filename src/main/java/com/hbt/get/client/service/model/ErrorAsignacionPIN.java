package com.hbt.get.client.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorAsignacionPIN {

    private String type;
    private String title;
    private int status;
    private List<Details> details;
    private String instance;

}
