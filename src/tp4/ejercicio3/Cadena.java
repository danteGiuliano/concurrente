/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio3;

/**
 *
 * @author Dan
 */
public class Cadena {

    private String cadena;
    private int turno;
    private int turnoMax;

    public Cadena(int max) {
        this.cadena = "";
        this.turno=1;
        this.turnoMax=max;

    }
    public void siguienteTurno(){
        this.turno++;
        if(turno>turnoMax){
            this.turno=1;
        }
    }

    public synchronized void escribir(char caracter)throws Exception {
        this.cadena += caracter;
    }

    public String obtenerCadena() {
        return this.cadena;
    }

    public boolean verificarTurno(int turno) {
        return this.turno == turno;
    }

}
