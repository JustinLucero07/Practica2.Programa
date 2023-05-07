/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.lucerojustin.tacurijhonatan.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Compositor extends Persona{
    
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> cliente;

    public Compositor() {
        cliente = new ArrayList();
        cancionesTop100Billboard = new ArrayList();
    }

    public Compositor(int numeroDeComposiciones, List<Cancion> cancionesTop100Billboard, List<Cantante> cliente, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = cancionesTop100Billboard;
        this.cliente = cliente;
    }  

    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
    }
    
    

    
    @Override
    public double calcularSalario() {
        double salarioFinal = getSalario();
        if (numeroDeComposiciones > 5){
            double regalia = 300;
            return regalia + salarioFinal;
        }
        /*if(cancionesTop100Billboard.size() >= 1 && cancionesTop100Billboard.size() <= 3){
            double c = salarioFinal * 0.10;
            return salarioFinal + c;
        }
        if (cancionesTop100Billboard.size() >=4 && cancionesTop100Billboard.size() <= 6){
            double d = salarioFinal * 0.20;
            return salarioFinal + d;
        }
        if(cancionesTop100Billboard.size() > 6){
            double e = salarioFinal * 0.20;
            return salarioFinal + e;
        }*/
        return salarioFinal;
    }
    
    public void agregarCancion(int codigo,String titulo,String letra,double tiempoEnMinutos){
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesTop100Billboard.add(cancion);
    }
    
    public void agregarCliente(List<Cantante> cliente){
        Cantante clientes = new Cantante();
        cliente.add(clientes);
    }    

    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) {
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cantante> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100Billboard=" + cancionesTop100Billboard + ", cliente=" + cliente + '}';
    }
    
    
}
