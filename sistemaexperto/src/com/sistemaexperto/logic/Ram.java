/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

/**
 *
 * @author Cesar
 */
public class Ram extends Componente {
    
    private String capacidad;
    private String tipo;
    private String velocidad;

    public Ram(String capacidad, String tipo, String velocidad, String marca, byte prioridad,String referencia) {
        super(marca, prioridad, referencia);
        this.capacidad = capacidad;
        this.tipo = tipo;
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
