package bme.hu.carinfo;

import bme.hu.carinfo.SugarAppApplication;
import bme.hu.carinfo.SugarAppApplicationComponent;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

/**
 * Created by Máté on 02/05/2016.
 */
public class TestHelper {

    public static void setTestInjector() {
        SugarAppApplication application = (SugarAppApplication)RuntimeEnvironment.application;
        SugarAppApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.setInjector(injector);
    }
}