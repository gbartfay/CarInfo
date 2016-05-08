package bme.hu.carinfo.interactor;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.model.MyDataModel;

/**
 * Created by Gyuri_2 on 2016.04.22.
 */
public class ModelInteractor {
    @Inject
    MyDataModel model;


    public ModelInteractor() {
        MyApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextData();
    }
}