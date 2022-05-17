package com.example.pruebapelis.Peticiones;

import retrofit2.Retrofit;
import com.example.pruebapelis.Utilidades.credencialesUsuario;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.gson.Gson;

public class Servicios {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(credencialesUsuario.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());



}
