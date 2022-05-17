package com.example.pruebapelis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pruebapelis.Peticiones.Servicios;
import com.example.pruebapelis.Response.buscarPelisResponse;
import com.example.pruebapelis.Utilidades.PelisApi;

public class ListaPelisActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetRetrofitResponse();
            }
        });
}

    private void GetRetrofitResponse() {
        PelisApi pelisApi = Servicios.getPelisApi();

        Call<buscarPelisResponse> responseCall =
    }


}