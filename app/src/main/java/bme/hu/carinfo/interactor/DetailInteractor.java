package bme.hu.carinfo.interactor;

import java.util.List;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.model.MyDataModel;
import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.network.DetailApi;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Gyuri_2 on 2016.04.22.
 */
public class DetailInteractor {
    @Inject
    MyDataModel model;

  //  @Inject
 //   DetailApi detailAPI;



    public DetailInteractor() {
        MyApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextData();
    }

    public void addCarToNetwork(Car toAdd) throws Exception {
        Response response = null;

//        Call call = detailAPI.detailsPost(toAdd.getBrand());
//        try {
//            response = call.execute();
//        } catch (Exception e) {
//            throw new Exception("Network error on execute with post!");
//        }
//        if (response.code() != 200) {
//            throw new Exception("Network error with post!");
//        }
    }


    public List<Car> getCarFromNetwork() throws Exception {
        Response<List<Car>> response = null;

//        Call<List<Car>> call = detailAPI.detailsGet("brand", "model");
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