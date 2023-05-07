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
public class Cantante extends Persona {
    
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante() {
        discografia = new ArrayList();
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, List<Disco> discografia, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
    }
 
    @Override
    public double calcularSalario() {
        double salarioFinal = getSalario();
    
        if (numeroDeSencillos > 10 && numeroDeGiras > 3) {
            int comision = 1000;
            salarioFinal += comision;
        }
        if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) {
            double f = salarioFinal * 0.05;
            salarioFinal += f;
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            double g = salarioFinal * 0.03;
            salarioFinal += g;
        }
        //if (discografia.size() >= 5) {
           // int bono = 2000;
           // salarioFinal += bono;
        //}
        return salarioFinal;
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
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.discografia);
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
        return Objects.equals(this.discografia, other.discografia);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantante:" + "\nNombreArtistico:" + nombreArtistico + "\nGeneroMusical=" + generoMusical + "\nNumeroDeSencillos=" + numeroDeSencillos + "\nNumeroDeConciertos=" + numeroDeConciertos + "\nNumeroDeGiras=" + numeroDeGiras + "\nLista de Discos: " + discografia +'}';
    }  
}
