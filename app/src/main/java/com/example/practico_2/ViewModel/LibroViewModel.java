package com.example.practico_2.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practico_2.Model.Libro;
import com.example.practico_2.R;

import java.util.Arrays;
import java.util.List;

public class LibroViewModel extends ViewModel {
    private MutableLiveData<Libro> libroSeleccionado = new MutableLiveData<>();
    public LiveData<Libro> getLibroSeleccionado() { return libroSeleccionado; }

    private List<Libro> libros = Arrays.asList(
            new Libro("el abuelo", "Jonas Jonasson", 2009,"Una historia extremadamente audaz e ingeniosa que sorprendera constantemente al lector. Jonas Jonasson nos regala un personaje maravilloso. Un abuelo sin prejuicios que no esta dispuesto a renunciar al placer de vivir. Momentos antes de que empiece la pomposa celebracion de su centesimo cumpleaños, Allan Karlsson decide que nada de eso va con el. Vestido con su mejor traje y unas pantuflas, se encarama a una ventana y se fuga de la residencia donde vive, dejando plantados al alcalde y a la prensa local. Sin saber adonde ir, se encamina a la estacion de autobuses, el unico sitio donde es posible pasar desapercibido.", R.drawable.libro_1),
            new Libro("el medico", "Noah Gordon", 1986,"Trata de la vida de un joven cristiano inglés del siglo XI que viaja por Europa para estudiar medicina entre los persas. El médico. de Noah Gordon (1926-2021)",R.drawable.libro_2),
            new Libro("napoles 1944", "Norman Lewis", 2000, "En 1944 Norman Lewis, agente del Servicio de Inteligencia británico, llegó a Napoles, donde las condiciones de vida eran tan precarias que los habitantes habian devorado hasta los peces del acuario municipal... testimonio único de uno de los mejores escritores de viajes", R.drawable.libro_3)
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