/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

/**
 *
 * @author Cesar
 */
public class TarjetaGrafica extends Componente {
    
    private String velocidad;
    private String tipo;
    private String capacidad;

    public TarjetaGrafica(String velocidad, String tipo, String capacidad, String marca, byte prioridad,String referencia) {
        super(marca, prioridad,referencia);
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    /**
     * @return the velocidad
     */
    public String getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the capacidad
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
