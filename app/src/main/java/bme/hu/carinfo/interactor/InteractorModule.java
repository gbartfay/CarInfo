package bme.hu.carinfo.interactor;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import bme.hu.carinfo.presenter.MainPresenter;

/**
 * Created by Gyuri_2 on 2016.04.22..
 */
@Module
public class InteractorModule {
    @Provides
    public StringInteractor getStringInteractor() {
        return new StringInteractor();
    }
}