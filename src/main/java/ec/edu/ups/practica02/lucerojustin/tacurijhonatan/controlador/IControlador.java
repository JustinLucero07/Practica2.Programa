/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.controlador;

import ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases.Persona;

/**
 *
 * @author Usuario
 */
public interface IControlador {
    
    public int MAX_OBJECTS =10; // Define una constante pública para el número máximo de objetos que se pueden almacenar en la base de datos
    public abstract Persona buscarPorNombreDeDisco(String valor); // Declara un método público abstracto para buscar una persona por el nombre de un disco y devuelve un objeto de tipo Persona
    public abstract Persona buscarPorTituloDeCancion(String valor); // Declara un método público abstracto para buscar una persona por el título de una canción y devuelve un objeto de tipo Persona
    public abstract void create(Object obj); // Declara un método público abstracto para crear un objeto en la base de datos y recibe un objeto de tipo Object
    public abstract Persona read(Object obj); // Declara un método público abstracto para leer un objeto de la base de datos y recibe un objeto de tipo Object, y devuelve un objeto de tipo Persona
    public abstract void update(Object obj); // Declara un método público abstracto para actualizar un objeto en la base de datos y recibe un objeto de tipo Object
    public abstract void delete(Object obj); // Declara un método público abstracto para eliminar un objeto de la base de datos y recibe un objeto de tipo Object
    public abstract void imprimir(); // Declara un método público abstracto para imprimir la información almacenada en la base de datos
    
}
