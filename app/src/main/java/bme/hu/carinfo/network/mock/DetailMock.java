package bme.hu.carinfo.network.mock;

import android.net.Uri;

import bme.hu.carinfo.model.sugarorm.Car;
import bme.hu.carinfo.network.GsonHelper;
import bme.hu.carinfo.network.NetworkConfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by mobsoft on 2016. 05. 09..
 */

public class DetailMock {

    static List<Car> peopleList = new ArrayList<>();
    static boolean isInitialised = false;

    public static Car testP1 = new Car();
    public static Car testP2 = new Car();

    public static Response process(Request request) {
        Uri uri = Uri.parse(request.url().toString());

        String responseString;
        int responseCode;
        Headers headers = request.headers();

        if (uri.getPath().equals(NetworkConfig.ENDPOINT_PREFIX + "details") && request.method().equals("GET")) {
            if (!isInitialised) {
                peopleList.add(testP1);
                peopleList.add(testP2);
                isInitialised = true;
            }
            responseString = GsonHelper.getGson().toJson(peopleList);
            responseCode = 200;
        } else if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "models") && request.method().equals("GET")) {
            int startOfData = uri.getPath().lastIndexOf('/');
            String name = uri.getPath().substring(startOfData + 1);
            peopleList.add(new Car());

            responseString = "";
            responseCode = 200;
        } else {
            responseString = "ERROR";
            responseCode = 503;
        }

        return MockHelper.makeResponse(request, headers, responseCode, responseString);
    }

    public static void resetList() {
        peopleList.clear();
        isInitialised = false;
    }
}
