/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Dan
 */
public class Colores {

    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
    private String unColor;

    public Colores(String unColor) {
        switch (unColor) {
            case "rojo":
                this.unColor = ROJO;
                break;
            case "verde":
                this.unColor = VERDE;
                break;
            case "amarillo":
                this.unColor = AMARILLO;
                break;
            case "azul":
                this.unColor = AZUL;
                break;
            case "violeta":
                this.unColor = PURPLE;
                break;
            case "cyan":
                this.unColor = CYAN;
                break;
            case "blanco":
                this.unColor = BLANCO;
                break;
            case "negro":
                this.unColor = NEGRO;
                break;
            case "aleatorio":
                String array[]={ROJO,VERDE,AMARILLO,AZUL,PURPLE,CYAN,BLANCO,NEGRO};
                int number = (int)(Math.random()*7);
                this.unColor=array[number];
                break;
            default:
                this.unColor = NEGRO;
                break;
        }

    }

    public String pintar(String aCadena) {
        String aux = this.unColor;
        return aux + aCadena+RESET;
    }
    public static String colorAleatorio(String texto){
        Colores q = new Colores("aleatorio");
        return q.pintar(texto);
    }
}
