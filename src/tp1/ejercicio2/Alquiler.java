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
    private static int iva=10;
    private int precioAlquiler;
    private int posAmarre;
    private int cantDias;
    private Barco unBarco;
    private Cliente unCliente;

    public Alquiler(int posAmarre, int cantDias, Barco unBarco, Cliente unCliente) {
        this.precioAlquiler = calcularValor(unBarco,cantDias);
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
    private int registrarAlquiler(Barco unBarco,int canDias){
        return calcularValor(unBarco,canDias);
    }
    private static int calcularValor(Barco unBarco,int canDias){
        return precioBase(unBarco)*canDias;
    }
    private static int precioBase(Barco unBarco){
        return unBarco.getEslora()*iva;
    }
    private static void setAlcualizarIva(int unNumero){
        iva=unNumero;
    }
}
