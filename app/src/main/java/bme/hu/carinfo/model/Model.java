package bme.hu.carinfo.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
@Module
public class Model {
    @Provides
    public MyDataModel getStringModel() {
        return new MyDataModel();
    }
}


