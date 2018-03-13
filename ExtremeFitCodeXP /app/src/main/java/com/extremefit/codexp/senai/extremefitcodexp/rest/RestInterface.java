package com.extremefit.codexp.senai.extremefitcodexp.rest;

import com.extremefit.codexp.senai.extremefitcodexp.model.Conta;
import com.extremefit.codexp.senai.extremefitcodexp.model.Funcionario;
import com.extremefit.codexp.senai.extremefitcodexp.model.Usuario;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;


/**
 * Created by codexp on 12/03/2018.
 */

public interface RestInterface {

    @POST("auth/login")
    Call<ResponseBody> buscarLogin(@Body Conta conta);

    @POST("funcionarios")
    Call<Funcionario> salvarFuncionario(@Body Funcionario funcionario);

    @POST("usuarios")
    Call<Usuario> salvarUsuario(@Body Usuario usuario);

    @PUT("funcionarios")
    Call<Funcionario> atualizarFuncionario(@Body Funcionario funcionario);

    @PUT("usuarios")
    Call<Usuario> atualizarUsuario(@Body Usuario usuario);
}
