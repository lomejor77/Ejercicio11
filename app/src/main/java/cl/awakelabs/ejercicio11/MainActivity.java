package cl.awakelabs.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cl.awakelabs.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnTurn.setOnClickListener(view -> Toast.makeText(this, "Modo avion apagado", Toast.LENGTH_SHORT).show());
        binding.btnUpdating.setOnClickListener(view -> Toast.makeText(this, "Actualizacion de perfil", Toast.LENGTH_SHORT).show());
        binding.btnGallery.setOnClickListener(view -> Toast.makeText(this, "Guardar foto en la galeria", Toast.LENGTH_SHORT).show());
        binding.btnUnlock.setOnClickListener(view -> Toast.makeText(this, "Desbloquear nivel 5", Toast.LENGTH_SHORT).show());
        binding.btnLevel.setOnClickListener(view -> Toast.makeText(this, "Nivel 4 completado", Toast.LENGTH_SHORT).show());
        binding.btnPause.setOnClickListener(view -> Toast.makeText(this, "Musica en pausa", Toast.LENGTH_SHORT).show());

    }

}