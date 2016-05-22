package bme.hu.carinfo.interactor;

import java.util.List;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.model.MyDataModel;
import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.model.sugarorm.Model;
import bme.hu.carinfo.network.BrandsApi;
import bme.hu.carinfo.network.DetailApi;
import bme.hu.carinfo.network.ModelsApi;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Gyuri_2 on 2016.04.22.
 */
public class ModelInteractor {
    @Inject
    MyDataModel model;

    @Inject
    ModelsApi modelAPI;


    public ModelInteractor() {
        MyApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextData();
    }


    public List<Model> getModelFromNetwork(String brand) throws Exception {
        Response<List<Model>> response = null;

        Call<List<Model>> call = modelAPI.modelsGet(brand);
        try {
            response = call.execute();
        } catch (Exception e) {
            throw new Exception("Network error on execute with get!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with get!");
        }

        return response.body();
    }
}