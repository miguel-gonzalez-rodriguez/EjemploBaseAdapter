package com.cidead.pmdm.ejemplobaseadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Obtener los datos para el listado
        // En este caso, un ArrayList de objetos DatosPersonales
        // Esto es una mala práctica, deberíamos hacerlo en otra clase
        ArrayList<DatosPersonales> misDatos = new ArrayList<>();
        misDatos.add(new DatosPersonales("Juan", "Pérez"));
        misDatos.add(new DatosPersonales("Ana", "Gómez"));
        misDatos.add(new DatosPersonales("Carlos", "López"));
        misDatos.add(new DatosPersonales("María", "Martínez"));
        misDatos.add(new DatosPersonales("Laura", "Fernández"));
        misDatos.add(new DatosPersonales("Luis", "Torres"));
        misDatos.add(new DatosPersonales("Sofía", "Ramírez"));
        misDatos.add(new DatosPersonales("Javier", "Hernández"));
        misDatos.add(new DatosPersonales("Elena", "Morales"));
        misDatos.add(new DatosPersonales("Diego", "Cruz"));
        misDatos.add(new DatosPersonales("Miguel","González"));
        misDatos.add(new DatosPersonales("Juan", "Pérez"));
        misDatos.add(new DatosPersonales("Ana", "Gómez"));
        misDatos.add(new DatosPersonales("Carlos", "López"));
        misDatos.add(new DatosPersonales("María", "Martínez"));
        misDatos.add(new DatosPersonales("Laura", "Fernández"));
        misDatos.add(new DatosPersonales("Luis", "Torres"));
        misDatos.add(new DatosPersonales("Sofía", "Ramírez"));
        misDatos.add(new DatosPersonales("Javier", "Hernández"));
        misDatos.add(new DatosPersonales("Elena", "Morales"));
        misDatos.add(new DatosPersonales("Diego", "Cruz"));

        // Instancia el ListView que hemos definido en la UI
        ListView lista = findViewById(R.id.lista);

        // Instancia el Adaptador
        DatosPersonalesAdaptador adaptador = new DatosPersonalesAdaptador(misDatos,this);

        // Asigna el adaptador a la lista, para que cargue los items
        lista.setAdapter(adaptador);

        // Lanzamos un Toast cada vez que pulsamos un elemento
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, misDatos.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}