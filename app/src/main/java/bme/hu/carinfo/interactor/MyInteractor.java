package bme.hu.carinfo.interactor;

import javax.inject.Inject;

import hu.bme.aut.amorg.examples.mvpstart.MVPApplication;
import bme.hu.carinfo.model.MyDataModel;

/**
 * Created by Gyuri_2 on 2016.04.22.
 */
public class MyInteractor {
    @Inject
    MyDataModel model;

    public MyInteractor() {
        MVPApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextString();
    }
}