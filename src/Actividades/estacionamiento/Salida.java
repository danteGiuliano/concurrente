
package Actividades.estacionamiento;

/**
 *
 * @author Dan
 */
public class Salida extends Puerta {

    public Salida(String nombre, Estacionamiento unEstacionamiento, boolean tipo) {
        super(nombre, unEstacionamiento, tipo);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    void accion() {
        if (tipo) {
            if (this.estacionamineto.ocupacionMoto()) {
             
                    System.out.println("Sacando una moto por: " + Thread.currentThread().getName());
                    this.estacionamineto.saleMoto();
                
            } else {
                System.out.println("No hay motos!");

            }
        } else {
            if (this.estacionamineto.ocupacionAuto()) {
              
                    System.out.println("Sacando un auto por: " + Thread.currentThread().getName());
                    this.estacionamineto.saleAuto();
                

            } else {
                System.out.println("No hay motos!");
            }
        }
    }

}
