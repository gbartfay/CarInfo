package bme.hu.carinfo;

import android.app.Application;

import bme.hu.carinfo.view.ViewModule;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
//import bme.hu.carinfo.R;
import io.fabric.sdk.android.Fabric;


/**
 * Created by Gyuri_2 on 2016.04.25..
 */
public class MyApplication extends Application {

    public static MyApplicationComponent injector;

    private Tracker mTracker;


    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        if (BuildConfig.FLAVOR.equals("mock")) {
            injector = DaggerMockMyApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        } else {
            injector = DaggerMyApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }

    }

    public void setInjector(MyApplicationComponent appComponent) {
        injector = appComponent;
        injector.inject(this);
    }

    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     */
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

}
