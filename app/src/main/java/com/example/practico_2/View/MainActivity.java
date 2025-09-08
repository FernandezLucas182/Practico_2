package com.example.practico_2.View;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.practico_2.databinding.ActivityMainBinding;
import com.example.practico_2.Model.Libro;
import com.example.practico_2.ViewModel.LibroViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private LibroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(LibroViewModel.class);

        binding.btnBuscar.setOnClickListener(v -> {
            String titulo = binding.etTitulo.getText().toString();
            viewModel.buscarLibro(titulo);
        });

        viewModel.getLibroSeleccionado().observe(this, libro -> {
            if (libro != null) {
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("titulo", libro.getTitulo());
                intent.putExtra("autor", libro.getAutor());
                intent.putExtra("anio", libro.getAnio());
                intent.putExtra("descripcion", libro.getDescripcion());
                intent.putExtra("imagenId", libro.getImagenId());
                startActivity(intent);
            } else {
                binding.tvResultado.setText("Libro no encontrado.");
            }
        });
    }
}