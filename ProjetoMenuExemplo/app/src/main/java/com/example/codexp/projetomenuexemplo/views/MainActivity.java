package com.example.codexp.projetomenuexemplo.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.codexp.extremefitcodexp.R;
import com.example.codexp.extremefitcodexp.commons.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences sharedPreferences = getSharedPreferences(AppUtils.SHARED_KEY, Context.MODE_PRIVATE);
        String token = sharedPreferences.getString("token", "");
        Log.d("tokenValido", token);



    }
}
