package bme.hu.carinfo.unittests;


import bme.hu.carinfo.BuildConfig;
import bme.hu.carinfo.RobolectricDaggerTestRunner;
import bme.hu.carinfo.DaggerMockMyApplicationComponent;
import bme.hu.carinfo.MockMyApplicationComponent;
import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.PeopleInteractor;
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
    public PeopleInteractor interactor;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        interactor = new PeopleInteractor();
    }

    @Test
    public void getterTest() throws Exception {
        String name = "lala";
        Person p = new Person(name);
        assertEquals(p.getName().equals(name), true);
    }

    @Test
    public void mockGetTest() throws Exception {
        PeopleMock.resetList();
        if (BuildConfig.FLAVOR == "mock") {
            List<Person> p = interactor.getPeopleFromNetwork();
            assertEquals(p.get(0).getName(), PeopleMock.testP1.getName());
            assertEquals(p.get(1).getName(), PeopleMock.testP2.getName());
        }
    }

    @Test
    public void mockAddTest() throws Exception {
        PeopleMock.resetList();
        if (BuildConfig.FLAVOR == "mock") {
            Car n = new Car();
            interactor.addPersonToNetwork(n);
            List<Car> p = interactor.getPeopleFromNetwork();
            assertEquals(p.get(1).getName(), PeopleMock.testP1.getName());
            assertEquals(p.get(2).getName(), PeopleMock.testP2.getName());
            assertEquals(p.get(0).getName(), n.getName());
        }
    }
}