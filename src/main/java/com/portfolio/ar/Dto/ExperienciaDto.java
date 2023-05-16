package com.portfolio.ar.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Ariel
 */
public class ExperienciaDto {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    //Constructor

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
    //Getter and Setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
}
