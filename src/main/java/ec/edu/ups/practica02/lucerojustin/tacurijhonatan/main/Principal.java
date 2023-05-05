/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.main;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Persona;


/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        //Disco dis1 = new Disco(2, "ddd", 2000);
        double s1= 1200;
      
        Persona p1 = new Cantante("Feid", "rock", 5, 2, 3, 1, "Fernando", "Garcia", 23, "Gringo", s1);
        p1.calcularSalario(1200);
    }
}
