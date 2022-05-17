package com.example.pruebapelis.Response;

import com.example.pruebapelis.Modelos.ModelosPelis;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class pelisResponse {
    @SerializedName("results")
    @Expose
    private ModelosPelis peli;


    public ModelosPelis getModelosPelis(){
        return peli;
    }

    @Override
    public String toString() {
        return "pelisResponse{" +
                "peli=" + peli +
                '}';
    }
}
