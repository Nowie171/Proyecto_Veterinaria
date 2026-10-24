/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author micha
 */
public class Ave extends Animal {
    
    // --------------- Atributos ------------------
    
    private String especie;
    private boolean puedeVolar;
    
    // -------------- Constructor ----------------  

    public Ave() {
    }

    public Ave(String codigo, String nombre, int edad, String estado) {
        super(codigo, nombre, edad, estado);
    }

    // ------------------- get y set ----------------

    public String getEspecie() {
        return especie;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    // --------------- Metodos abstractos ---------------
    
    @Override
    public double calcularCostoCuidado() {
        
        double costoBase = 40000.0;
        
        if (!puedeVolar) {
            costoBase += 10000.0; 
        }
        return costoBase;
    }

    @Override
    public String mostrarInformacion() {
        
        return "AVE   | Código: " + codigo + " | Nombre: " + nombre + " | Edad: " + edad + " años"
                + "\n   -> Estado: " + estado + " | Especie: " + especie
                + " | Vuela: " + (puedeVolar ? "Sí" : "No");
    }

}
