package bme.hu.carinfo.model;

import bme.hu.carinfo.model.MyDataModel;
import dagger.Module;
import dagger.Provides;


@Module
public class ModelModule {
    @Provides
    public MyDataModel getMyDataModel() {
        return new MyDataModel();
    }
}
