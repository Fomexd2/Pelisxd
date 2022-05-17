package com.example.pruebapelis.Response;

import com.example.pruebapelis.Modelos.ModelosPelis;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class buscarPelisResponse {
    @SerializedName("total_results")
    @Expose()
    private int total_count;

    @SerializedName("results")
    @Expose()
    private List<ModelosPelis> pelis;

    public int getTotal_count(){
        return total_count;
    }

    public List<ModelosPelis> getPelis(){
        return pelis;
    }

    @Override
    public String toString() {
        return "buscarPelisResponse{" +
                "total_count=" + total_count +
                ", pelis=" + pelis +
                '}';
    }
}
