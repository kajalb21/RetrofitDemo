package com.sohamsaa.retrofitdemo;


import javax.security.auth.callback.Callback;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyRetroFitInterface {

    @POST("/getMyCartDetails")
    Call<CartDetails> getCartDetails(@Body CartDetailsBody cartDetailsBody);



}
