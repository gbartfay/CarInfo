package bme.hu.carinfo.view;

import android.content.Context;

import javax.inject.Singleton;

import bme.hu.carinfo.presenter.MainPresenter;
import dagger.Module;
import dagger.Provides;



@Module
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }
}
