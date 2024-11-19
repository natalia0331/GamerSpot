package com.example.gamerspotv2.models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("gamerspot/api.php")
    Call<String> getApiData();

    // Obtener lista de desarrolladores
    @GET("developers")
    Call<List<Developer>> getDevelopers();

    // Obtener eventos/lanzamientos por tipo
    @GET("events_releases?type={type}")
    Call<List<EventRelease>> getEventsOrReleases(@Path("type") String type);

    // Obtener comentarios de un evento/lanzamiento
    @GET("comments?eventOrReleaseId={id}")
    Call<List<Comment>> getComments(@Path("id") String eventOrReleaseId);



}

