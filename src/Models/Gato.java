/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author micha
 */
public class Gato extends Animal {
    
    // --------------- Atributos ------------------
    
    private String raza;
    private boolean esInterior;
    private int nivelSocializacion; 
   
    // -------------- Constructor ----------------  

    public Gato() {
    }

    public Gato(String codigo, String nombre, int edad, String estado) {
        super(codigo, nombre, edad, estado);
    }

    // ------------------- get y set ----------------

    public String getRaza() {
        return raza;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public int getNivelSocializacion() {
        return nivelSocializacion;
    }

    // --------------- Metodos abstractos ---------------
    
    @Override
    public double calcularCostoCuidado() {
        
        double costoBase = 60000.0;
        
        if (esInterior) {
            costoBase += 15000.0; 
        }
        return costoBase;
    }

    @Override
    public String mostrarInformacion() {
        
        return "GATO  | Código: " + codigo + " | Nombre: " + nombre + " | Edad: " + edad + " años"
                + "\n   -> Estado: " + estado + " | Raza: " + raza + " | Interior: " + (esInterior ? "Sí" : "No")
                + " | Socialización: Nivel " + nivelSocializacion;
    }

}
