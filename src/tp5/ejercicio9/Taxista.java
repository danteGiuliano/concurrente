
package tp5.ejercicio9;

/**
 *
 * @author Dan
 */
public class Taxista implements Runnable {

    private Taxi taxi;

    public Taxista(Taxi taxi) {
        this.taxi = taxi;
    }

    public void run() {
        try {
            System.out.println("Taxista listo.");
            Thread.sleep(100);
            int i = 0;
            while (true) {
                if (this.taxi.hayPasajero()) {
                    System.out.println("Taxista:" + i + " *despertando* ");
                    System.out.println("Taxista: " + i + " llevando a pasajero");
                    Thread.sleep(1000);
                    System.out.println("Taxista: " + i + " LLegada a destino.");
                    this.taxi.bajaPasajero();
                    i++;
                }
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
