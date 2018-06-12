package com.sohamsaa.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit = null;
    Call<CartDetails> cartDetailsCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.41:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MyRetroFitInterface myRetroFitInterface = retrofit.create(MyRetroFitInterface.class);
        cartDetailsCall = myRetroFitInterface.getCartDetails(new CartDetailsBody("7538"));

        findViewById(R.id.tvResp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cartDetailsCall.enqueue(new Callback<CartDetails>() {
                    @Override
                    public void onResponse(Call<CartDetails> call, Response<CartDetails> response) {
                        int a = 10;
                        int b = 10;
                    }

                    @Override
                    public void onFailure(Call<CartDetails> call, Throwable t) {
                        int a = 10;
                        int b = 10;
                    }
                });

            }
        });
    }
}
