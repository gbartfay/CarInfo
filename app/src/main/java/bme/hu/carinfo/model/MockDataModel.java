package bme.hu.carinfo.model;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class MockDataModel extends MyDataModel {

    @Override
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
