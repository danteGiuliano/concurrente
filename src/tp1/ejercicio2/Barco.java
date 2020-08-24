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
public class Barco {
    private int eslora;
    private String fechaFabricacion;
    private String matricula;

    public Barco(int eslora, String fechaFabricacion, String matricula) {
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
  
}
