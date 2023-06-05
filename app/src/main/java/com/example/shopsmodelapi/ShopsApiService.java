package com.example.shopsmodelapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShopsApiService {
    @GET("renukaTemplates")
    Call<List<Shops>> fetchShopItems();
}
