/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.main;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Disco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion = 0;
        do {           
            System.out.println("1.Ingresar Cantante. \n2.Ingresar Compositor. \n3.Agregar Clientes. \n4.Imprimir Persona. \n5.Busqueda de Cantante por Nombre de Disco. \n6.Busqueda de compositor por nombre de Cancion. \n7.Salir");
            System.out.println("Ingrese un numero: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de cantantes que desea ingresar: ");
                    int cantidadCantantes = teclado.nextInt();
        
                    for (int i = 1; i <= cantidadCantantes; i++) {
                        System.out.println("Ingrese los datos del cantante #" + i + ":");
                    
                        System.out.print("Codigo: ");
                        int codigo = teclado.nextInt();
            
                        System.out.print("Nombre: ");
                        String nombre = teclado.next();
                    
                        System.out.print("Apellido: ");
                        String apellido = teclado.next();
                    
                        System.out.print("Edad: ");
                        int edad = teclado.nextInt();
                    
                        System.out.print("Nacionalidad: ");
                        String nacionalidad = teclado.next();
            
                        System.out.print("Salario: ");
                        double salario = teclado.nextDouble();
                    
                        System.out.print("Nombre Artistico: ");
                        String nArtistico = teclado.next();
                    
                        System.out.print("Genero Musical: ");
                        String generoMusical = teclado.next();
            
                        System.out.print("Número de sencillos: ");
                        int numeroSencillos = teclado.nextInt();
                    
                        System.out.print("Numero de Conciertos: ");
                        int numeroConciertos = teclado.nextInt();
            
                        System.out.print("Número de giras: ");
                        int numeroGiras = teclado.nextInt();
                    
                        System.out.print("Ingrese el numero de discos que desea ingresar: : ");
                        int n = teclado.nextInt();
                    
                        List<Disco> discografia = new ArrayList<>();
                        
                        for (int j = 1; j <= n ; j++) {
                            
                            System.out.println("Ingrese los datos del Disco #" + j + ":");
                            
                            System.out.print("Codigo del Disco: ");
                            int co = teclado.nextInt();
                            
                            System.out.print("Nombre del Disco: ");
                            String nombreDis = teclado.next();
                            
                            System.out.print("Anio Lanzamiento: ");
                            int anio = teclado.nextInt();
                            
                            
                            Disco disco = new Disco(co, nombreDis, anio);
                            discografia.add(disco);
                            
                        }
                    
            
                    Cantante cantante = new Cantante(nArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras, discografia, codigo, nombre, apellido, edad, nacionalidad, salario);
                    // Agregar el cantante a una lista o hacer algo con él
                        System.out.println(cantante.toString());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de compositor que desea ingresar: ");
                    int cantidadCantantes1 = teclado.nextInt();
        
                    for (int i = 1; i <= cantidadCantantes1; i++) {
                        System.out.println("Ingrese los datos del compositor #" + i + ":");
                    
                        System.out.print("Codigo: ");
                        int codigo2 = teclado.nextInt();
            
                        System.out.print("Nombre: ");
                        String nombre2 = teclado.next();
                    
                        System.out.print("Apellido: ");
                        String apellido2 = teclado.next();
                    
                        System.out.print("Edad: ");
                        int edad2 = teclado.nextInt();
                    
                        System.out.print("Nacionalidad: ");
                        String nacionalidad2 = teclado.next();
            
                        System.out.print("Salario: ");
                        double salario2 = teclado.nextDouble();
                    
                        System.out.print("Numero de Composiciones: ");
                        int numeroComposiciones = teclado.nextInt();
                    
                        System.out.print("Ingrese el numero de canciones TOP 100 Billboard: ");
                        int cancionesTop = teclado.nextInt();
                        
                        List<Cancion> canciones = new ArrayList<>();
                        
                        for (int j = 1; j <= cancionesTop; j++){
                            
                            System.out.print("Codigo de la Cancion: ");
                            int codigo3 = teclado.nextInt();
                            
                            System.out.print("Titulo de la cancion: ");
                            String titulo = teclado.next();
                            
                            System.out.print("Letra de la cancion: ");
                            String letra = teclado.next();
                            
                            System.out.print("Duracion de la cancion: ");
                            double tiempo = teclado.nextDouble();
                            
                            Cancion cancionUno = new Cancion(codigo3, titulo, letra, tiempo);
                            canciones.add(cancionUno);
                        }
                        
                        System.out.println("Ingrese el numero de clientes: ");
                        int nc = teclado.nextInt();
                        
                        List<Cantante> cliente = new ArrayList<>();
                        
                        for (int k = 1; k <= cancionesTop; k++){
                            
                            
                        }
                        
                        Compositor compo = new Compositor(numeroComposiciones, canciones, cliente, codigo2, nombre2, apellido2, edad2, nacionalidad2, salario2);
                        System.out.println(compo);
                    break;
                /*case 3:
                    metodoS();
                    break;
                case 4:
                    imprimir();
                    break;
                case 5:
                    
                    break;
                case 6:
                    break;*/
            }
        } while (opcion != 7); 
    }
}
