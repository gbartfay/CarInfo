package bme.hu.carinfo;

import android.app.Application;

import bme.hu.carinfo.view.ViewModule;

/**
 * Created by Gyuri_2 on 2016.04.25..
 */
public class MyApplication extends Application {

    public static MVPApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerMVPApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
