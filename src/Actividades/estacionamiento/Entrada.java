package Actividades.estacionamiento;

/**
 *
 * @author Dan
 */
public class Entrada extends Puerta {

    public Entrada(String nombre, Estacionamiento unEstacionamiento, boolean tipo) {
        super(nombre, unEstacionamiento, tipo);
    }

    public void run() {
        super.run();
    }

    void accion() {
        if (this.hayLugar()) {

            if (tipo) {

                System.out.println("Estacionando moto por: " + Thread.currentThread().getName());
                this.estacionamineto.ingresaMoto();

            } else {

                System.out.println("Estacionando Auto por: " + Thread.currentThread().getName());
                this.estacionamineto.ingresaAuto();

            }
        } else {
            if (tipo) {
                System.out.println("-------No hay lugar disponible para Motos ");
            } else {
                System.out.println("-------No hay lugar disponible para Autos");
            }

        }

    }

}
