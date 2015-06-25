package com.example.zyn.mycoursera;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

//asynctask to get json from httpserver
public class Myasynctask extends AsyncTask<String, Void, List<courseBean>> {
    private static final String TAG = "ASYNC_TASK";
    private Context context;

    private ListView lw;


    public Myasynctask(ListView lw,Context context){
        this.context=context;
        this.lw=lw;
    }
    @Override
        protected void onPreExecute() {
            Log.i(TAG, "onPreExecute() called");
        }

    @Override
        protected List<courseBean> doInBackground(String... params) {
            Log.i(TAG, "doInBackground(String... params) called");
    //        List<String> cities = new ArrayList<String>();
            String citiesString = HttpUtils.sendGetMessage(params[0], "utf-8");
            //    解析服务器端的json数据
            JsonUtils jsU=new JsonUtils();
            return jsU.JsonUtils(citiesString);
        }

    @Override
        protected  void onPostExecute(List<courseBean> result){
            lw.setAdapter(new courseAdapter(context,result));
        }
    }
