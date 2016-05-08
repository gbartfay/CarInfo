package bme.hu.carinfo.model;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.database.Car;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
    public class MyDataModel {

    //db hivas lesz majd itt

    protected int idx = 0;

    public String getNextData() {
        Car testCar = new Car();
        testCar.setBrand("Audi");
        testCar.setModel("A4");
        testCar.save();
        String[] list = {
                "Audi", "Honda", "BMW"
        };

        if (idx == list.length) {
            idx = 0;
        }
        return list[idx++];
    }


}

