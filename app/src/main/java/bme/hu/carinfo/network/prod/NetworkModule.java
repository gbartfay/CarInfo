package bme.hu.carinfo.network.prod;


import bme.hu.carinfo.network.DetailApi;
import bme.hu.carinfo.network.GsonHelper;
import bme.hu.carinfo.network.NetworkConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by mobsoft on 2016. 05. 09..
 */
@Module
public class NetworkModule {

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        OkHttpClient.Builder clientBuilder = null;
        try {
            clientBuilder = UnsafeClientFactory.getUnsafeClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (clientBuilder == null) {
            throw new RuntimeException("HttpClient cannot be initialized!");
        }

        return clientBuilder;
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public DetailApi provideDefaultApi(Retrofit retrofit) {
        return retrofit.create(DetailApi.class);
    }

}

