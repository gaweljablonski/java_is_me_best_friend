package com.mojitoproject.mysqlconnectionwithretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyApi {
    @FormUrlEncoded
    @POST("insert.php")
    Call<ModelClass>insertData(
            @Field("Name")String Name,
            @Field("Description")String Description,
            @Field("Ingredients")String Ingredients,
            @Field("Percentage")int Percentage

    );

    


}
