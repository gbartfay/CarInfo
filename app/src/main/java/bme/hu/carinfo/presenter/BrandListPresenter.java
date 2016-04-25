package bme.hu.carinfo.presenter;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.interactor.MyInteractor;
import bme.hu.carinfo.view.BrandListView;
import bme.hu.carinfo.view.MainView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */

public class BrandListPresenter extends Presenter<BrandListView> {

    @Inject
    public MyInteractor interactor;

    public BrandListPresenter() {
        MyApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
