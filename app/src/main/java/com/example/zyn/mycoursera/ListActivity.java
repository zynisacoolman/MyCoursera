/*name,university name,Icon,workload*/
package com.example.zyn.mycoursera;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListActivity extends Activity {
    private ListView lw;
    private final String httpUrl = "https://api.coursera.org/api/catalog.v1/courses?fields=name,smallIcon,";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lw=(ListView)findViewById(R.id.lw);
        //首先获取webservice返回字符串
        Myasynctask Myasynctask = new Myasynctask(lw,this.getApplicationContext());
        Myasynctask.execute(httpUrl);
    }


}
