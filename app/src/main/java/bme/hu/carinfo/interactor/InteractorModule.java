
package bme.hu.carinfo.interactor;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {
    @Provides
    public MyInteractor getStringInteractor() {
        return new MyInteractor();
    }
}
