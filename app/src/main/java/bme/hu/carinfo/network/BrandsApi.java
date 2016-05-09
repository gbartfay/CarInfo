package bme.hu.carinfo.network;




import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import bme.hu.carinfo.model.sugarorm.Brand;
import bme.hu.carinfo.model.sugarorm.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BrandsApi {
  
  /**
   * Get car brands
   * Returns the brands of the cars.
   * @return Call<List<Brand>>
   */
  
  @GET("brands")
  Call<List<Brand>> brandsGet();
    

  
}
