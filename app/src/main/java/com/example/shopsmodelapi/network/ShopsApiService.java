package com.example.shopsmodelapi.network;

import com.example.shopsmodelapi.modal.Shops;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShopsApiService {
    @GET("renukaTemplates")
    Call<List<Shops>> fetchShopItems();
}
