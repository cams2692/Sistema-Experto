/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

/**
 *
 * @author Cesar
 */
public class Procesador extends Componente{
    
    private String velocidad;
    private String arquitectura;
    private String nucleos;
    
    public Procesador(String velocidad, String arquitectura, String marca,String nucleos, byte prioridad,String referencia) {
        super(marca, prioridad,referencia);
        this.velocidad = velocidad;
        this.arquitectura = arquitectura;
        this.nucleos=nucleos;
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
     * @return the arquitectura
     */
    public String getArquitectura() {
        return arquitectura;
    }

    /**
     * @param arquitectura the arquitectura to set
     */
    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    /**
     * @return the nucleos
     */
    public String getNucleos() {
        return nucleos;
    }

    /**
     * @param nucleos the nucleos to set
     */
    public void setNucleos(String nucleos) {
        this.nucleos = nucleos;
    }
    
    
    
}
