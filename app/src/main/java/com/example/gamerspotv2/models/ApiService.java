package com.example.gamerspotv2.models;

import com.example.gamerspotv2.loginModel.UserResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class ApiService {
    @GET("gamerspot/api.php?action=getUsers")
    public Call<List<UserResponse>> getUsers() {
        return null;
    }
}
