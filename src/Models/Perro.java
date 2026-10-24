/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author micha
 */
public class Perro extends Animal {
    
    // --------------- Atributos ------------------
    
    private String raza;
    private String tamanio;
    private boolean requierePaseo;

    // -------------- Constructor ----------------    
    
    public Perro() {
    }
  
    public Perro(String raza, String tamanio, boolean requierePaseo, String codigo, String nombre, int edad, String estado) {
        super(codigo, nombre, edad, estado);
        this.raza = raza;
        this.tamanio = tamanio;
        this.requierePaseo = requierePaseo;
    }

    // ------------------- get y set ----------------
    
    public String getRaza() {
        return raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public boolean isRequierePaseo() {
        return requierePaseo;
    }
    
    // --------------- Metodos abstractos ---------------

    @Override
    public double calcularCostoCuidado() {
        
        double costoBase = 80000.0;
        
        if (tamanio.equalsIgnoreCase("GRANDE")) {
            costoBase += 30000.0; 
            
        }
        if (requierePaseo) {
            
            costoBase += 20000.0; 
        }
        return costoBase;
    }

    @Override
    public String mostrarInformacion() {
        
        return "PERRO | Código: " + codigo + " | Nombre: " + nombre + " | Edad: " + edad + " años"
                + "\n   -> Estado: " + estado + " | Raza: " + raza + " | Tamaño: " + tamanio
                + " | Paseo: " + (requierePaseo ? "Sí" : "No");
    }

}
