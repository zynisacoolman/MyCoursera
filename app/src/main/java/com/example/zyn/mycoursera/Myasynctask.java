package com.example.zyn.mycoursera;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

//asynctask to get json from httpserver
public class Myasynctask extends AsyncTask<String, Void, List<String>> {

    @Override
    protected List<String> doInBackground(String... params) {

        List<String> cities = new ArrayList<String>();
        String citiesString = HttpUtils.sendGetMessage(params[0], "utf-8");
        //    解析服务器端的json数据
        cities = JsonUtils.parseCourses();
        return cities;
    }

    @Override
    protected void onPostExecute(List<String> result) {
        adapter = new ArrayAdapter<String>(ListActivity.class, android.R.layout.simple_spinner_item, result);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        dialog.dismiss();
    }
}
