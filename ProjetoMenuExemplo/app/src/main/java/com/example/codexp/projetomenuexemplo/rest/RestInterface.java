package com.example.codexp.projetomenuexemplo.rest;

import com.example.codexp.extremefitcodexp.model.Conta;
import com.example.codexp.extremefitcodexp.model.Funcionario;
import com.example.codexp.extremefitcodexp.model.Usuario;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by codexp on 06/03/2018.
 */

public interface RestInterface {

        @POST("auth/login")
        Call<ResponseBody> buscarLogin(@Body Conta conta);

        @POST("funcionarios")
        Call<Funcionario> salvarFuncionario(@Body Funcionario funcionario);

        @POST("usuarios")
        Call<Usuario> salvarUsuario(@Body Usuario usuario);

        @GET("funcionarios/{id}")
        Call<Funcionario> buscarFuncionario(@Path("id") Long id);

        @GET("usuarios/{id}")
        Call<Usuario> buscarUsuario(@Path("id") Long id);


}
