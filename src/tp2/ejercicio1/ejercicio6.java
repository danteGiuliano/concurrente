/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.ejercicio1;

/**
 *
 * @author Dan
 */
public class ejercicio6 {

    public static double acceso_por_indice(double[] v, int j)
            throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
// Desde el siguiente cliente “main”:

    public static void main(String[] args) {
        double[] v = new double[15];
        acceso_por_indice(v, 16);
    }

    /**
     * El codigo usa de muy mala practica el uso de excepciones. los modulos
     * deben estar encapsulados con los posibles casos de fallo, no esta bueno
     * abusar de las excepciones.
     *
     * el codigo no usa una comvencion de variables apropiada al proposito del
     * modulo
     *
     * los nombres no son apropiados
     *
     * un abuso de excepciones, lo que hace un codigo poco legible.
     * 
     * un modulo definido como un double, no deberia imprimir. ya que hace mas complejo su debug
     *
     *
     * Mejora: definir el comportamiento como un booleano, ya que retorna el
     * mismo array pasado por parametro se utiliza como caso verdadero si el
     * indice es valido.
     *
     * nombres significativos
     *
     */
    public static boolean indiceValido(double array[], int indice) {
        boolean flag = false;
        if (indice >= 0 && indice < array.length) {
            flag = true;
        }
        return flag;
    }
}
