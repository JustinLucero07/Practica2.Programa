/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.main;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Disco;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Persona;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.controlador.ControladorPersona;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.controlador.IControlador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        // Se crea una instancia de la clase Scanner para leer la entrada del usuario desde la consola.
        Scanner teclado = new Scanner(System.in);
        // Se crea una instancia de la interfaz IControlador y se le asigna una instancia de la clase ControladorPersona.
        IControlador controlador = new ControladorPersona();

        int opcion = 0;
        do {
            // Se muestra un menú de opciones al usuario.
            System.out.println("1.Ingresar Cantante. \n2.Ingresar Compositor. \n3.Agregar Clientes. \n4.Imprimir Persona. \n5.Busqueda de Cantante por Nombre de Disco. \n6.Busqueda de compositor por nombre de Cancion. \n7.Salir");
            System.out.println("Ingrese un numero: ");
            // Se lee la opción seleccionada por el usuario.
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Se le solicita al usuario la cantidad de cantantes que desea ingresar.
                    System.out.print("Ingrese la cantidad de cantantes que desea ingresar: ");
                    int cantidadCantantes = teclado.nextInt();
                    for (int i = 1; i <= cantidadCantantes; i++) {
                        System.out.println("Ingrese los datos del cantante #" + i + ":");
                        // Se le solicita al usuario los datos del cantante.
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
                        // Se crea una lista vacía de discos para el cantante.
                        List<Disco> discografia = new ArrayList<>();
                        // Se crea una instancia de la clase Cantante con los datos ingresados por el usuario.
                        Cantante cantante = new Cantante(nArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras, discografia, codigo, nombre, apellido, edad, nacionalidad, salario);
                        for (int j = 1; j <= n; j++) {
                            System.out.println("Ingrese los datos del Disco #" + j + ":");
                            // Se le solicita al usuario ingresar los datos del disco.
                            
                            System.out.print("Codigo del Disco: ");
                            int co = teclado.nextInt();
                            
                            System.out.print("Nombre del Disco: ");
                            String nombreDis = teclado.next();
                            
                            System.out.print("Anio Lanzamiento: ");
                            int anio = teclado.nextInt();
                            
                            cantante.agregarDisco(co, nombreDis, anio);
                            
                            
                        }
                    // Agregar el cantante a una lista 
                        controlador.create(cantante);
                    }
                    
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de compositor que desea ingresar: ");
                    int cantidadCantantes1 = teclado.nextInt();
        
                    for (int i = 1; i <= cantidadCantantes1; i++) {
                        System.out.println("Ingrese los datos del compositor #" + i + ":");
                        // Se le solicita al usuario los datos del compositor.
                    
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
                        
                        List<Cancion> canciones = new ArrayList<>(); //Se crea una lista vacia de canciones.
                        List<Cantante> cliente = new ArrayList<>(); //Se crea una lista vacia de clientes.
                        
                        // Se crea una instancia de la clase Compositor con los datos ingresados por el usuario.
                        Compositor comp1 = new Compositor(numeroComposiciones, canciones, cliente, codigo2, nombre2, apellido2, edad2, nacionalidad2, salario2);
                        
                        for (int j = 1; j <= cancionesTop; j++){
                            //Se pide al usuario el ingreso de la datos de una cancion
                            
                            System.out.print("Codigo de la Cancion: ");
                            int codigo3 = teclado.nextInt();
                            
                            System.out.print("Titulo de la cancion: ");
                            String titulo = teclado.next();
                            
                            System.out.print("Letra de la cancion: ");
                            String letra = teclado.next();
                            
                            System.out.print("Duracion de la cancion: ");
                            double tiempo = teclado.nextDouble();
                           
                            comp1.agregarCancion(codigo3, titulo, letra, tiempo); //Se agrega una cancion usando el metodo agregar cancion de la clase Compositor
                        }
                        controlador.create(comp1); // Agregar el compositor a una lista 
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero de clientes que desea agregar: ");
                    int ag = teclado.nextInt();
                    for (int i = 0; i < ag; i++) { //Bucle que pide los clientes que quiere agregar segun el numero de quieres antes preguntado
                        System.out.println("Ingrese el nombre del compositor al que le quiere agregar un cantante: "); // Imprime un mensaje para que el usuario ingrese el nombre del compositor
                        String comp = teclado.next(); // Lee la entrada del usuario y la almacena en la variable "comp"
                        Compositor compo = (Compositor)controlador.read(comp); // Busca en la base de datos la información del compositor ingresado por el usuario y la almacena en la variable "compo"
                        if(compo == null){ // Verifica si la variable "compo" está vacía, lo que significa que no se encontró el compositor buscado
                            System.out.println("Compositor no existe"); // Imprime un mensaje de error si el compositor no existe en la base de datos
                        } else if(compo != null){ // Si la variable "compo" no está vacía, significa que se encontró la información del compositor
                            System.out.println("Ingrese el nombre del cantante:" ); // Imprime un mensaje solicitando el nombre del cantante
                            String cant = teclado.next(); // Lee la entrada del usuario y la almacena en la variable "cant"
                            Cantante canta = (Cantante)controlador.read(cant); // Busca en la base de datos la información del cantante ingresado por el usuario y la almacena en la variable "canta"
                            System.out.println("El cantante se agrego con exito");
                            if (canta == null ){ // Verifica si la variable "canta" está vacía, lo que significa que no se encontró el cantante buscado
                                System.out.println("El cantante no existia : "); // Imprime un mensaje de error si el cantante no existe en la base de datos
                            }else if (canta != null){ // Si la variable "canta" no está vacía, significa que se encontró la información del cantante
                                compo.agregarCliente(canta); // Agrega al cantante a la lista de clientes del compositor
                            }
                        }
                    }
                    break; // Sale del switch

                case 4:
                    controlador.imprimir(); // Llama al método "imprimir()" del objeto controlador para imprimir la información almacenada en la base de datos
                    break; // Sale del switch   

                case 5:
                    System.out.println("Ingrese el disco para encontrar el cantante que busca: "); // Imprime un mensaje solicitando el nombre del disco
                    String valor = teclado.next(); // Lee la entrada del usuario y la almacena en la variable "valor"
                    Persona a = controlador.buscarPorNombreDeDisco(valor); // Busca en la base de datos el cantante asociado con el disco ingresado por el usuario y lo almacena en la variable "a"
                    System.out.println(a.getNombre()); // Imprime el nombre del cantante asociado con el disco
                    break; // Sale del switch    

                case 6:
                    System.out.println("Ingrese la cancion: "); // Imprime un mensaje solicitando el título de la canción
                    String valorUno = teclado.next(); // Lee la entrada del usuario y la almacena en la variable "valorUno"
                    Persona b = controlador.buscarPorTituloDeCancion(valorUno); // Busca en la base de datos el cantante asociado con la canción ingresada por el usuario y lo almacena en la variable "b"
                    System.out.println(b.getNombre()); // Imprime el nombre del cantante asociado con la canción
                    break; // Sale del switch
            }
        } while (opcion != 7);
    }
}
