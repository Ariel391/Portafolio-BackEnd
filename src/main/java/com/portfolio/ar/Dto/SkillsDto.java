package com.portfolio.ar.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Ariel
 */
public class SkillsDto {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    //Constructor
    
    public SkillsDto() {
    }

    public SkillsDto(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    //Getter and Setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
