package bme.hu.carinfo.presenter;

import javax.inject.Inject;

import hu.bme.aut.amorg.examples.mvpstart.MVPApplication;
import hu.bme.aut.amorg.examples.mvpstart.interactor.StringInteractor;
import bme.hu.carinfo.view.MainView;

/**
 * Created by mobsoft on 2016. 04. 11..
 */

public class MainPresenter extends Presenter<MainView> {

    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        MVPApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
