/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cantante extends Persona { // Define la clase Cantante, que extiende de la clase Persona

    private String nombreArtistico; // Define el nombre artistico del cantante
    private String generoMusical; // Define el género musical del cantante
    private int numeroDeSencillos; // Define el número de sencillos que ha lanzado el cantante
    private int numeroDeConciertos; // Define el número de conciertos que ha dado el cantante
    private int numeroDeGiras; // Define el número de giras que ha realizado el cantante
    private List<Disco> discografia; // Define la discografía del cantante, que es una lista de objetos de la clase Disco

    public Cantante() { // Constructor por defecto de la clase Cantante
        discografia = new ArrayList(); // Inicializa la lista de discos del cantante
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, List<Disco> discografia, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) { // Constructor personalizado de la clase Cantante
        super(codigo, nombre, apellido, edad, nacionalidad, salario); // Invoca al constructor de la clase Persona con los parámetros correspondientes
        this.nombreArtistico = nombreArtistico; // Asigna el nombre artistico del cantante
        this.generoMusical = generoMusical; // Asigna el género musical del cantante
        this.numeroDeSencillos = numeroDeSencillos; // Asigna el número de sencillos del cantante
        this.numeroDeConciertos = numeroDeConciertos; // Asigna el número de conciertos del cantante
        this.numeroDeGiras = numeroDeGiras; // Asigna el número de giras del cantante
        this.discografia = discografia; // Asigna la discografía del cantante
    }
 
    @Override
    public double calcularSalario() { // Sobrescribe el método calcularSalario de la clase Persona
        double salarioFinal = getSalario(); // Obtiene el salario del cantante y lo asigna a una variable auxiliar

        if (numeroDeSencillos > 10 && numeroDeGiras > 3) { // Si el cantante ha lanzado más de 10 sencillos y ha realizado más de 3 giras
            int comision = 1000; // Se asigna una comisión de 1000
            salarioFinal += comision; // Se le agrega la comisión al salario final
        }
        if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) { // Si el cantante ha lanzado entre 1 y 10 sencillos
            double f = salarioFinal * 0.05; // Se calcula el 5% del salario final
            salarioFinal += f; // Se le agrega el 5% al salario final
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) { // Si el cantante ha realizado entre 1 y 3 giras
            double g = salarioFinal * 0.03; // Se calcula el 3% del salario final
            salarioFinal += g; // Se le agrega el 3%
        }
        if (discografia.size() >= 5) {
            int bono = 2000; // Se asigna un bono de 2000
            salarioFinal += bono; // Se agrega el bono
        }
        return salarioFinal; //Retorna el salarioFinal 
    }

    
    public void agregarDisco(int codigo,String nombre,int anioDeLanzamiento){
        Disco discoUno = new Disco(codigo, nombre, anioDeLanzamiento);
        discografia.add(discoUno);
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscos() {
        return discografia;
    }

    public void setDiscos(List<Disco> discos) {
        this.discografia = discos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombreArtistico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cantante other = (Cantante) obj;
        return Objects.equals(this.nombreArtistico, other.nombreArtistico);
    }

   

    @Override
    public String toString() {
        return "Cantnta"+ super.toString()  + "\nNombreArtistico:" + nombreArtistico + "\nGeneroMusical=" + generoMusical + "\nNumeroDeSencillos=" + numeroDeSencillos + "\nNumeroDeConciertos=" + numeroDeConciertos + "\nNumeroDeGiras=" + numeroDeGiras + "\nLista de Discos: " + discografia ;
    }  
}
