package bme.hu.carinfo;

import javax.inject.Singleton;

import bme.hu.carinfo.interactor.BrandInteractor;
import bme.hu.carinfo.interactor.DetailInteractor;
import bme.hu.carinfo.interactor.InteractorModule;
import bme.hu.carinfo.interactor.ModelInteractor;
import bme.hu.carinfo.interactor.MyInteractor;
import bme.hu.carinfo.model.ModelModule;
import bme.hu.carinfo.presenter.BrandListPresenter;
import bme.hu.carinfo.presenter.DetailPresenter;
import bme.hu.carinfo.presenter.MainPresenter;
import bme.hu.carinfo.presenter.ModelListPresenter;
import bme.hu.carinfo.view.MainActivity;
import bme.hu.carinfo.view.ViewModule;
import dagger.Component;



@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface MyApplicationComponent {
        void inject(MainActivity mainActivity);

        void inject(MainPresenter mainPresenter);

        void inject(MyInteractor stringInteractor);

        void inject(BrandInteractor interactor);

        void inject(ModelInteractor interactor);

        void inject(DetailInteractor interactor);

        void inject(BrandListPresenter brandListPresenter);

        void inject(ModelListPresenter modelListPresenter);

        void inject(DetailPresenter detailPresenter);

        void inject(MyApplication app);
}
