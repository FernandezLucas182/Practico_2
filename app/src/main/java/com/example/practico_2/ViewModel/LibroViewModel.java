package com.example.practico_2.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practico_2.Model.Libro;

import java.util.Arrays;
import java.util.List;

public class LibroViewModel extends ViewModel {
    private MutableLiveData<Libro> libroSeleccionado = new MutableLiveData<>();
    public LiveData<Libro> getLibroSeleccionado() { return libroSeleccionado; }

    private List<Libro> libros = Arrays.asList(
            new Libro("1984", "George Orwell", 1949),
            new Libro("Cien años de soledad", "Gabriel García Márquez", 1967),
            new Libro("El principito", "Antoine de Saint-Exupéry", 1943)
    );

    public void buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libroSeleccionado.setValue(libro);
                return;
            }
        }
        libroSeleccionado.setValue(null);
    }
}