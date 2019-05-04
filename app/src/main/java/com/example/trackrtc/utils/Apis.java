package com.example.trackrtc.utils;

import com.example.trackrtc.model.BusList;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;

public interface Apis {
    String BASE_URL = "https://api.myjson.com/bins/";

    @GET("dqjzo")
    Call<ArrayList<BusList>> getBusList();
}
