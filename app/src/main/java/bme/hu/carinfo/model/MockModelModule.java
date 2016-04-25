package bme.hu.carinfo.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
@Module
public class MockModelModule  {

    @Provides
    public MyDataModel getMyDataModel() {
        return new MockDataModel();
    }
}
