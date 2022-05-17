package com.example.pruebapelis.Modelos;

import android.os.Parcel;
import android.os.Parcelable;
//Declaraciones
public class ModelosPelis implements Parcelable {
    private String title;
    private String poster_path;
    private String release_date;
    private int movie_id;
    private String movie_overiew;
//Constructores
    public ModelosPelis(String title, String poster_path, String release_date, int movie_id, String movie_overiew) {
        this.title = title;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.movie_id = movie_id;
        this.movie_overiew = movie_overiew;
    }
//Parceables
    protected ModelosPelis(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        movie_id = in.readInt();
        movie_overiew = in.readString();
    }

    public static final Creator<ModelosPelis> CREATOR = new Creator<ModelosPelis>() {
        @Override
        public ModelosPelis createFromParcel(Parcel in) {
            return new ModelosPelis(in);
        }

        @Override
        public ModelosPelis[] newArray(int size) {
            return new ModelosPelis[size];
        }
    };
//Getters
    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public String getMovie_overiew() {
        return movie_overiew;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(poster_path);
        parcel.writeString(release_date);
        parcel.writeInt(movie_id);
        parcel.writeString(movie_overiew);
    }
}
