/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

/**
 *
 * @author Cesar
 */
public class Computador extends Componente {
    private double valor;
    private DiscoDuro disco;
    private Procesador procesador;
    private Ram ram;
    private TarjetaGrafica tarjeta;

    public Computador(double valor, DiscoDuro disco, Procesador procesador, Ram ram, TarjetaGrafica tarjeta, String marca, byte prioridad,String referencia) {
        super(marca, prioridad, referencia);
        this.valor = valor;
        this.disco = disco;
        this.procesador = procesador;
        this.ram = ram;
        this.tarjeta = tarjeta;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the disco
     */
    public DiscoDuro getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    /**
     * @return the procesador
     */
    public Procesador getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the ram
     */
    public Ram getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    /**
     * @return the tarjeta
     */
    public TarjetaGrafica getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(TarjetaGrafica tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
