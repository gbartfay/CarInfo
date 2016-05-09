package bme.hu.carinfo;

import bme.hu.carinfo.MyApplicationComponent;
import bme.hu.carinfo.interactor.InteractorModule;
import bme.hu.carinfo.network.mock.MockNetworkModule;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Máté on 02/05/2016.
 */
@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class})
public interface TestComponent extends MyApplicationComponent {
}