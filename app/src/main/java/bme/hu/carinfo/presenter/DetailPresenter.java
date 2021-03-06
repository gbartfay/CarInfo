package bme.hu.carinfo.presenter;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.interactor.MyInteractor;
import bme.hu.carinfo.view.ModelListView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */

public class DetailPresenter extends Presenter<ModelListView> {

    @Inject
    public MyInteractor interactor;

    public DetailPresenter() {
        MyApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
