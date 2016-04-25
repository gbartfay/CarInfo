package bme.hu.carinfo.presenter;

import javax.inject.Inject;

import bme.hu.carinfo.interactor.MyInteractor;
import hu.bme.aut.amorg.examples.mvpstart.MVPApplication;
import bme.hu.carinfo.view.MainView;

/**
 * Created by mobsoft on 2016. 04. 11..
 */

public class MainPresenter extends Presenter<MainView> {

    @Inject
    public MyInteractor interactor;

    public MainPresenter() {
        MVPApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
