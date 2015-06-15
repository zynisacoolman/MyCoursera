/*name,university name,Icon,workload*/
package com.example.zyn.mycoursera;
import android.app.Activity;
import android.os.Bundle;



public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String httpUrl = "https://api.coursera.org/api/catalog.v1/courses?fields=name,smallIcon";

    }


}
