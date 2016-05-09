package bme.hu.carinfo.network;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import bme.hu.carinfo.model.sugarorm.Model;
import bme.hu.carinfo.model.sugarorm.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ModelsApi {
  
  /**
   * Get car models
   * Returns the models of the cars.
   * @param brand selected brand name
   * @return Call<List<Model>>
   */
  
  @GET("models")
  Call<List<Model>> modelsGet(
    @Query("brand") String brand
  );

  
}
