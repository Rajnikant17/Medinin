package com.example.medinin.Util;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiServiceClass {

    @POST("/mongodb/Login")
    Single<MLoginResponse> getHomePage(@Body MLogin mLogin);
}
