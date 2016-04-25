package bme.hu.carinfo.model;

/**
 * Created by mobsoft on 2016. 04. 11..
 */
public class MyDataModel {

    private int idx = 0;

    public String getNextData() {
        String[] list = {
                "Audi", "Honda", "BMW"
        };

        if (idx == list.length) {
            idx = 0;
        }
        return list[idx++];
    }
}

