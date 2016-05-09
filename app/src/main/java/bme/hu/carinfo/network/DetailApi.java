package bme.hu.carinfo.network;




import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.model.sugarorm.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DetailApi {
  
  /**
   * Get car details
   * Returns the details of the car model.
   * @param brand selected brand name
   * @param model selected model name
   * @return Call<List<Car>>
   */
  
  @GET("details")
  Call<List<Car>> detailsGet(
    @Query("brand") String brand, @Query("model") String model
  );

  
  /**
   * add car
   * post a new car
   * @param car car
   * @return Call<Void>
   */
  
  @POST("details")
  Call<Void> detailsPost(
    @Query("car") String car
  );

  
  /**
   * delete car
   * delete a car
   * @param brand Brand
   * @param model selected model name
   * @return Call<Void>
   */
  
  @DELETE("details")
  Call<Void> detailsDelete(
    @Query("brand") String brand, @Query("model") String model
  );

  
}
