package com.example.practico_2.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practico_2.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String titulo = getIntent().getStringExtra("titulo");
        String autor = getIntent().getStringExtra("autor");
        int anio = getIntent().getIntExtra("anio", 0);

        binding.tvTitulo.setText(titulo);
        binding.tvAutor.setText(autor);
        binding.tvAnio.setText(String.valueOf(anio));
    }
}
