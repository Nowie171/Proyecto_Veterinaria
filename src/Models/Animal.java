/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author micha
 */
abstract class Animal {
    
    // --------------- Atributos ------------------
    
    protected String codigo;
    protected String nombre;
    protected int edad;
    protected String estado; // "DISPONIBLE" o "ADOPTADO"
    
    // -------------- Constructor ----------------

    public Animal() {
    }

    public Animal(String codigo, String nombre, int edad, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        
    }
    
    // ------------------- get y set ----------------

    public String getCodigo() { 
        
        return codigo; 
    }
    public String getNombre() { 
        
        return nombre; 
    }
    
    public int getEdad() { 
        
        return edad; 
    }
    
    public String getEstado() { 
        
        return estado; 
    }
    
    public void setEstado(String estado) { 
        
        this.estado = estado; 
    }

    // --------------- Metodos abstractos ---------------
    
    public abstract double calcularCostoCuidado();
    
    public abstract String mostrarInformacion();
  
}
