/*name,university name,Icon,workload*/
package com.example.zyn.mycoursera;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListActivity extends Activity {
    private ListView lv;
    private final String httpUrl = "https://api.coursera.org/api/catalog.v1/courses?fields=name,smallIcon,";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new courseAdapter());
    }


}
