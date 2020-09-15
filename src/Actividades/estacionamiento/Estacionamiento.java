/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.estacionamiento;

/**
 *
 * @author Dan
 */
public class Estacionamiento {
    private int MAX_AUTOS;
    private int MAX_MOTOS;
    private int ocupacionMoto;
    private int ocupacionAuto;

    public Estacionamiento() {
    this.MAX_AUTOS=0;
    this.MAX_MOTOS=0;
    this.ocupacionAuto=0;
    this.ocupacionMoto=0;
    }
    
    public boolean hayEspacioMoto(){
        return this.MAX_MOTOS>=this.ocupacionMoto;
    }
    public boolean hayEspacioAuto(){
        return this.MAX_AUTOS>=this.ocupacionMoto;
    }
    public  void ingresaAuto(){
        this.ocupacionAuto=this.ocupacionAuto+1;
    }
     public  void ingresaMoto(){
        this.ocupacionMoto=this.ocupacionMoto+1;
    }
    public  void saleMoto(){
        this.ocupacionMoto=this.ocupacionMoto-1;
    }
    public  void saleAuto(){
        this.ocupacionAuto=this.ocupacionAuto-1;
    }
    public boolean ocupacionAuto(){
        return this.ocupacionAuto!=0;
    }
    public boolean ocupacionMoto(){
        return this.ocupacionMoto!=0;
    }
    public int lugaresDisponiblesMoto(){
        return this.ocupacionMoto;
    }
    public int lugaresDisponiblesAutos(){
        return this.ocupacionAuto;
    }
    
}
