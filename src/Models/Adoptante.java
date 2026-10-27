/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Oscar
 */
public class Adoptante {

    // --------------- Atributos ---------------
    private String documento;
    private String nombre;
    private String telefono;
    private String direccion;

    // --------------- Constructores ---------------
    public Adoptante() {
    }

    public Adoptante(String documento, String nombre, String telefono, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // --------------- Getters y Setters ---------------
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // --------------- Métodos ---------------
    @Override
    public String toString() {
        return "ADOPTANTE | Documento: " + documento + " | Nombre: " + nombre 
                + " | Teléfono: " + telefono + " | Dirección: " + direccion;
    }
}
