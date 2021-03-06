package com.example.pruebapelis.Peticiones;

import retrofit2.Retrofit;

import com.example.pruebapelis.Utilidades.PelisApi;
import com.example.pruebapelis.Utilidades.credencialesUsuario;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.gson.Gson;

public class Servicios {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(credencialesUsuario.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

            private static  Retrofit retrofit = retrofitBuilder.build();
            private static PelisApi pelisApi = retrofit.create(PelisApi.class);

            public static PelisApi getPelisApi(){
                return  pelisApi;
            }
}
