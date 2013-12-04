/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

/**
 *
 * @author Cesar
 */
public class DiscoDuro extends Componente {
    
    private String capacidad;
    private String velocidad;

    public DiscoDuro(String capacidad, String velocidad, String marca, byte prioridad,String referencia) {
        super(marca, prioridad, referencia);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
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
    
    
}
