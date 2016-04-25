package bme.hu.carinfo;

import android.app.Application;

import bme.hu.carinfo.view.ViewModule;

/**
 * Created by Gyuri_2 on 2016.04.25..
 */
public class MyApplication extends Application {

    public static MyApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMyApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
