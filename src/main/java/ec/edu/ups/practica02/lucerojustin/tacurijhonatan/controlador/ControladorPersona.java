/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.controlador;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Persona;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Disco;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Cancion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorPersona implements IControlador {
    private List<Persona> personas; // atributo de clase que almacena una lista de objetos Persona

    public ControladorPersona() {
        personas = new  ArrayList<>(); // constructor que inicializa la lista personas como un objeto ArrayList vacío
    }
    
    // método que busca personas que tienen un disco con el nombre especificado
    @Override
    public Persona buscarPorNombreDeDisco(String valor) {
        for(Persona persona : personas){
            if(persona instanceof Cantante){
                Cantante cantante = (Cantante) persona;
                for(Disco disco : cantante.getDiscos()){
                    if(disco.getNombre().equals(valor)){
                        System.out.println("Cantante: " + cantante.getNombreArtistico());
                        return cantante;
                    }
                }
            }
        }
        return null;
    }
    
    // método que busca personas que tienen una canción con el título especificado
    @Override
    public Persona buscarPorTituloDeCancion(String valor) {
        for (Persona persona : personas) { // iteramos sobre cada persona en la lista
            if (persona instanceof Compositor) { // si la persona es un compositor
                Compositor compositor = (Compositor) persona; // hacemos un cast a Compositor
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) { // iteramos sobre las canciones del compositor
                    if (cancion.getTitulo().equals(valor)) { // si encontramos una canción con el título buscado
                        System.out.println("Compositor: " + compositor.getNombre() + " " + compositor.getApellido());
                        System.out.println("Canción: " + cancion.getTitulo());
                        return compositor; // solo se imprime la primera coincidencia, por lo que terminamos el método con un return
                    }
                }
            }
        }
        System.out.println("No se encontró ninguna canción con el título '" + valor + "'"); // si no se encontró ninguna canción con el título buscado, se imprime este mensaje
        return null;
    }
    
    // método que agrega una persona a la lista personas
    @Override
    public void create(Object obj) {
        if (obj instanceof Persona){
            if (personas.size()>=MAX_OBJECTS){
                System.out.println("NO SE PUEDE INGRESAR MAS DATOS !!!");
                
            }else if (personas.size()< MAX_OBJECTS){
                personas.add((Persona)obj); 
            }
        } 
    }

    // método que busca una persona en la lista personas según su nombre
    @Override
    public Persona read(Object obj) {
        String cedula = (String) obj; // cast de obj a String
        for(Persona persona : personas){ // iteramos sobre cada persona en la lista
            if(persona.getNombre().equals(cedula)){ // si encontramos una persona con el nombre buscado
                return persona; // devolvemos el objeto persona encontrado
            }
        }
        return null; // si no se encontró ninguna persona, devolvemos null
    }


    @Override
    public void update(Object obj) {
        if(obj instanceof Persona){
            String cedula = ((Persona)obj).getNombre();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if(persona.getNombre().equals(cedula)){
                    personas.set(i, (Persona)obj);
                }
            }
        }
    }

    @Override
    public void delete(Object obj) {
        if(obj instanceof Persona){
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if(persona.equals((Persona)obj)){
                    personas.remove(i);
                }
            }
        } 
    }

    @Override
    public void imprimir() {
        for(Persona persona : personas){
            System.out.println(persona.toString());
            System.out.println("---------------------");
        }
    }
}
