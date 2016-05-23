package bme.hu.carinfo.interactor;

import java.util.List;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.model.MyDataModel;
import bme.hu.carinfo.model.sugarorm.Brand;
import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.network.BrandsApi;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Gyuri_2 on 2016.04.22.
 */
public class BrandInteractor {
    @Inject
    MyDataModel model;

   // @Inject
   // BrandsApi brandAPI;



    public BrandInteractor() {
        MyApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextData();
    }


    public List<Brand> getBrandFromNetwork() throws Exception {
        Response<List<Brand>> response = null;

//        Call<List<Brand>> call = brandAPI.brandsGet();
//        try {
//            response = call.execute();
//        } catch (Exception e) {
//            throw new Exception("Network error on execute with get!");
//        }
//        if (response.code() != 200) {
//            throw new Exception("Network error with get!");
//        }
//
       return response.body();
    }
}