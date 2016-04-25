package bme.hu.carinfo.presenter;

import javax.inject.Inject;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.interactor.MyInteractor;
import bme.hu.carinfo.view.MainView;


public class MainPresenter extends Presenter<MainView> {

    @Inject
    public MyInteractor interactor;

    public MainPresenter() {
        MyApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
