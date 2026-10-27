/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Oscar
 */
public class Adopcion {

    // --------------- Atributos ---------------
    private String codigo;
    private Adoptante adoptante;
    private Animal animal;
    private String fecha;
    private String estado;

    // --------------- Constructores ---------------
    public Adopcion() {
    }

    public Adopcion(String codigo, Adoptante adoptante, Animal animal, String fecha, String estado) {
        this.codigo = codigo;
        this.adoptante = adoptante;
        this.animal = animal;
        this.fecha = fecha;
        this.estado = estado;
    }

    // --------------- Getters y Setters ---------------
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // --------------- Métodos ---------------
    @Override
    public String toString() {
        String docAdoptante = (adoptante != null) ? adoptante.getNombre() + " (" + adoptante.getDocumento() + ")" : "Sin asignar";
        String infoAnimal = (animal != null) ? animal.getNombre() + " [" + animal.getCodigo() + "]" : "Sin asignar";

        return "ADOPCIÓN  | Código: " + codigo + " | Fecha: " + fecha + " | Estado: " + estado
                + "\n   -> Adoptante: " + docAdoptante
                + "\n   -> Animal: " + infoAnimal;
    }
}