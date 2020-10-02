/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio6;

import java.util.concurrent.Semaphore;
import java.util.ArrayList;

/**
 *
 * @author Dan
 */
public class Cadena {

    private String cadena; //Cadena que imprime.
    private Semaphore semCadena;
    private String expresion; //Expresion pasada por parametro
    //Variables de control de turno.
    private int turno;
    private int turnoMax;
    //Cantidad de veces que repite la expresion
    private int repeticion;

    public Cadena(String expresion, int repeticion) {
        this.expresion = expresion;
        this.cadena = " ";
        this.semCadena = new Semaphore(1);
        this.turno = 0;
        this.turnoMax = expresion.length() - 1;
        this.repeticion = repeticion;

    }

    public void escribir(char unaLetra) throws Exception {
        boolean flag = unaLetra == expresion.charAt(turno);
        if (flag) {
            semCadena.acquire();
            do {
                this.cadena = this.cadena + unaLetra;
                this.aumentarTurno();
            } while (expresion.charAt(turno) == unaLetra);
            semCadena.release();
        } else {
            Thread.yield();
            this.escribir(unaLetra);
        }
    }

    private void aumentarTurno() {
        this.turno = this.turno + 1;
        if (this.turno > turnoMax) {
            this.turno = 0;
        }
    }

    public int rutina() {
        return this.repeticion;
    }

    public String getCadena() {
        return this.cadena;
    }
}
