/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio1;

/**
 *
 * @author Dan
 */
public class CuentaBanco {

    private int balance = 50;

    public CuentaBanco() {
    }

    public  int getBalance() {
        return balance;
    }

    public synchronized void retiroBancario(int retiro) {
        balance = balance - retiro;
       
    }
}
