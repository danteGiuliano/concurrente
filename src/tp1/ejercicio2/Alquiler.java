/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio2;

/**
 *
 * @author Dan
 */
public class Alquiler {
    private int precioAlquiler;
    private int posAmarre;
    private int cantDias;
    private Barco unBarco;
    private Cliente unCliente;

    public Alquiler(int precioAlquiler, int posAmarre, int cantDias, Barco unBarco, Cliente unCliente) {
        this.precioAlquiler = precioAlquiler;
        this.posAmarre = posAmarre;
        this.cantDias = cantDias;
        this.unBarco = unBarco;
        this.unCliente = unCliente;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public Barco getUnBarco() {
        return unBarco;
    }

    public void setUnBarco(Barco unBarco) {
        this.unBarco = unBarco;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
    
}
