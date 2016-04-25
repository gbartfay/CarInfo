package bme.hu.carinfo;

import javax.inject.Singleton;

import bme.hu.carinfo.interactor.InteractorModule;
import bme.hu.carinfo.interactor.MyInteractor;
import bme.hu.carinfo.model.MockModelModule;
import bme.hu.carinfo.model.ModelModule;
import bme.hu.carinfo.presenter.BrandListPresenter;
import bme.hu.carinfo.presenter.MainPresenter;
import bme.hu.carinfo.view.MainActivity;
import bme.hu.carinfo.view.ViewModule;
import dagger.Component;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, MockModelModule.class})
//@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface MockMyApplicationComponent extends MyApplicationComponent{
}

