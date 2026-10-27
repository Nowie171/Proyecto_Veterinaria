/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class CentroAdopcion {

    // --------------- Atributos (Las 3 listas) ---------------
    private List<Animal> listaAnimales;
    private List<Adoptante> listaAdoptantes;
    private List<Adopcion> listaAdopciones;

    // --------------- Constructor ---------------
    public CentroAdopcion() {
        this.listaAnimales = new ArrayList<>();
        this.listaAdoptantes = new ArrayList<>();
        this.listaAdopciones = new ArrayList<>();
    }

    // --------------- Getters y Setters de las Listas ---------------
   
    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public List<Adoptante> getListaAdoptantes() {
        return listaAdoptantes;
    }

    public void setListaAdoptantes(List<Adoptante> listaAdoptantes) {
        this.listaAdoptantes = listaAdoptantes;
    }

    public List<Adopcion> getListaAdopciones() {
        return listaAdopciones;
    }

    public void setListaAdopciones(List<Adopcion> listaAdopciones) {
        this.listaAdopciones = listaAdopciones;
    }

    // --------------- Búsquedas por ID / Código ---------------
    public Animal buscarAnimalPorCodigo(String codigo) {
        for (Animal a : listaAnimales) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }

    public Adoptante buscarAdoptantePorDocumento(String documento) {
        for (Adoptante ad : listaAdoptantes) {
            if (ad.getDocumento().equalsIgnoreCase(documento)) {
                return ad;
            }
        }
        return null;
    }

    public Adopcion buscarAdopcionPorCodigo(String codigo) {
        for (Adopcion adop : listaAdopciones) {
            if (adop.getCodigo().equalsIgnoreCase(codigo)) {
                return adop;
            }
        }
        return null;
    }

    // --------------- Registro con Validación de Duplicados ---------------
    public boolean registrarAnimal(Animal nuevoAnimal) {
        if (nuevoAnimal == null || buscarAnimalPorCodigo(nuevoAnimal.getCodigo()) != null) {
            return false; // Ya existe un animal con ese código o es nulo
        }
        listaAnimales.add(nuevoAnimal);
        return true;
    }

    public boolean registrarAdoptante(Adoptante nuevoAdoptante) {
        if (nuevoAdoptante == null || buscarAdoptantePorDocumento(nuevoAdoptante.getDocumento()) != null) {
            return false; // Ya existe un adoptante con ese documento o es nulo
        }
        listaAdoptantes.add(nuevoAdoptante);
        return true;
    }


    public boolean realizarAdopcion(String codigoAdopcion, String docAdoptante, String codAnimal, String fecha) {
        // 1. Validar que el código de la adopción no exista ya
        if (buscarAdopcionPorCodigo(codigoAdopcion) != null) {
            return false;
        }

        Adoptante adoptante = buscarAdoptantePorDocumento(docAdoptante);
        Animal animal = buscarAnimalPorCodigo(codAnimal);

        if (adoptante == null || animal == null) {
            return false;
        }

 
        if (!animal.getEstado().equalsIgnoreCase("DISPONIBLE")) {
            return false; // El animal ya fue adoptado
        }

 
        animal.setEstado("ADOPTADO");

   
        Adopcion nuevaAdopcion = new Adopcion(codigoAdopcion, adoptante, animal, fecha, "ACTIVA");
        listaAdopciones.add(nuevaAdopcion);
        return true;
    }

  
    public boolean registrarAdopcionDirecta(Adopcion adopcion) {
        if (adopcion == null || buscarAdopcionPorCodigo(adopcion.getCodigo()) != null) {
            return false;
        }
        if (adopcion.getAnimal() != null) {
            adopcion.getAnimal().setEstado("ADOPTADO");
        }
        listaAdopciones.add(adopcion);
        return true;
    }

    // --------------- Consultas y Filtros Adicionales ---------------
    public List<Animal> obtenerAnimalesDisponibles() {
        List<Animal> disponibles = new ArrayList<>();
        for (Animal a : listaAnimales) {
            if (a.getEstado().equalsIgnoreCase("DISPONIBLE")) {
                disponibles.add(a);
            }
        }
        return disponibles;
    }
}