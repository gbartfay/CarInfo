package bme.hu.carinfo;

import android.content.Context;

import bme.hu.carinfo.interactor.InteractorModule;
import bme.hu.carinfo.model.ModelModule;
import bme.hu.carinfo.model.MyDataModel;
import bme.hu.carinfo.presenter.MainPresenter;
import bme.hu.carinfo.view.ViewModule;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Máté on 02/05/2016.
 */
@Module
public class TestModule {

    private final ViewModule viewModule;
    private final ModelModule modelModule;

    public TestModule(Context context) {

        this.viewModule = new ViewModule(context);
        this.modelModule = new ModelModule();
    }

    @Provides
    public Context provideContext() {
        return viewModule.provideContext();
    }

    @Provides
    public MyDataModel provideLoginPresenter() {
        return modelModule.getMyDataModel();
    }

    @Provides
    public MainPresenter provideMainPresenter() {
        return viewModule.provideMainPresenter();
    }
}