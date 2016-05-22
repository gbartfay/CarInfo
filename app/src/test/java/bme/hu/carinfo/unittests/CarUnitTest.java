package bme.hu.carinfo.unittests;


import bme.hu.carinfo.BuildConfig;
import bme.hu.carinfo.RobolectricDaggerTestRunner;
import bme.hu.carinfo.MockMyApplicationComponent;
import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.interactor.BrandInteractor;
import bme.hu.carinfo.model.sugarorm.Brand;
import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.network.mock.DetailMock;
import bme.hu.carinfo.view.ViewModule;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import java.util.List;

import javax.inject.Inject;

import static bme.hu.carinfo.TestHelper.setTestInjector;
import static org.junit.Assert.*;


@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class CarUnitTest {

    @Inject
    public BrandInteractor interactor;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        interactor = new BrandInteractor();
    }

    @Test
    public void getterTest() throws Exception {
        String testBrandName = "Ford";
        Car p = new Car();
        p.setBrand(testBrandName);
        assertEquals(p.getBrand().equals(testBrandName), true);
    }

    @Test
    public void mockGetTest() throws Exception {
        DetailMock.resetList();
        if (BuildConfig.FLAVOR == "mock") {
            List<Brand> p = interactor.getBrandFromNetwork();
            assertEquals(p.get(0).getName(), DetailMock.testP1.getBrand());
            assertEquals(p.get(1).getName(), DetailMock.testP2.getBrand());
        }
    }

}