package bme.hu.carinfo.view;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import bme.hu.carinfo.MyApplication;
import bme.hu.carinfo.R;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class ModelListActivity extends ListActivity implements BrandListView{

    private Tracker mTracker;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[] { "A2", "A3", "A4",
                "Q7" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);

        // Obtain the shared Tracker instance.
        MyApplication application = (MyApplication) getApplication();
        mTracker = application.getDefaultTracker();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showString(String s) {
        ((TextView)findViewById(R.id.tvPrint)).setText(s);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Log.i(TAG, "Setting screen name: " + name);
        mTracker.setScreenName("ModelActivity");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }
}
