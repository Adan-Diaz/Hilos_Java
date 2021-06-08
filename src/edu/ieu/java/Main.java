/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ieu.java;

/**
 *
 * @author yo_BM
 */
public class Main {
    
    public static void main(String[] args) {
        
                Cliente cliente1 = new Cliente("Cliente Michell", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente Eduardo", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente3 = new Cliente("Cliente José Adán", new int[] { 3, 8, 6, 1, 1 });

		Cajera cajera1 = new Cajera("Cajero Cesar");
		Cajera cajera2 = new Cajera("Cajero Isidro");
                Cajera cajera3 = new Cajera("Cajero Ramon");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
                cajera3.procesarCompra(cliente3, initialTime);
	}
    
}
