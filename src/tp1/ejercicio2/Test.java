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
public class Test {

    public static void main(String[] args) {

        Deportivo d1 = new Deportivo(12, "Puerto porto alegre 2009", "897-34d",456);
        Velero v1 = new Velero(36, "Puerto Rio negro 2015", "343-eqs",2);
        Yate y1 = new Yate(34, "Aserradero aserrajes 2005", "123-eqw",45,67);
        Deportivo d2 = new Deportivo(62, "Puerto porto alegre 2002", "897-34d",235);
        Velero v2 = new Velero(16, "Puerto Rio negro 2014", "344-eqs",3);
        Yate y2 = new Yate(24, "Aserradero aserrajes 2006", "122-eqw",34,23);
        Barco barcos[] = {d1, d2, y1, y2, v1, v2};
        Alquiler col[] = new Alquiler[5];
        Cliente cliente = new Cliente("Cosme", "fulanito", 23456789);
        for (int i = 0; i < 6; i++) {
            col[i] = new Alquiler(i + 2, (2 + i), barcos[i], cliente);
        }

    }
}
