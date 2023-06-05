package com.example.shopsmodelapi;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.shopsmodelapi.modal.Shops;
import com.example.shopsmodelapi.network.ShopsApi;
import com.example.shopsmodelapi.network.ShopsApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getShopItems() throws IOException {
        ShopsApiService shopsApiService = new ShopsApi().createShopsApiService();
        Call<List<Shops>> call = shopsApiService.fetchShopItems();
        List<Shops> shopList = call.execute().body();
        assertNotNull(shopList);
        assertFalse(shopList.isEmpty());
        System.out.println(new Gson().toJson(shopList));
    }
}