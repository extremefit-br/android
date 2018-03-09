package com.example.codexp.projetomenuexemplo.config;

import com.example.codexp.extremefitcodexp.commons.AppUtils;
import com.example.codexp.extremefitcodexp.rest.RestInterface;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by codexp on 06/03/2018.
 */

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {

        this.retrofit = new Retrofit.Builder()
                .baseUrl(AppUtils.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public RetrofitConfig(OkHttpClient client){

        this.retrofit = new Retrofit.Builder()
                .baseUrl(AppUtils.API_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    public RestInterface getRestInterface() {
        return this.retrofit.create(RestInterface.class);
    }


}
