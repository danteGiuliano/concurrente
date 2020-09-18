
package Actividades.estacionamiento;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Ejercicio del dia 15 de septiembre. problema de estacionamineto
         */
        
        Estacionamiento parque = new Estacionamiento();
        Thread hilos[] = new Thread[5];
        Entrada eMoto = new Entrada("Estrada Motos ", parque,true);
        Entrada eSur = new Entrada("Estrada sur", parque, false);
        Entrada eNorte = new Entrada("Estrada norte", parque, false);
        Salida salidaM = new Salida("Salida Motos", parque, true);
        Salida salidaA = new Salida("Salida Autos", parque, false);

        Puerta compuertas[] = {eMoto, eSur, eNorte, salidaM, salidaA};
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(compuertas[i]);
            hilos[i].setName(compuertas[i].getName());
        }
        for (Thread misHilos : hilos) {
            misHilos.start();
        }

    }
}
