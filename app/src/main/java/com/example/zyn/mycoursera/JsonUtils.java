package com.example.zyn.mycoursera;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;






/**
 * Created by zyn on 15-6-18.
 */
public class JsonUtils {
    /***
     * @param courseString 从服务器上获取的Json数据
     * @return 解析JSON字符串数据，放入List<bean>当中
     */
    public static List<courseBean> JsonUtils(String courseString) {
        List<courseBean> courses = new ArrayList<>();
        String o="0";

        try {
//            JSONObject jsonObject = new JSONObject(courseString);
//            JSONArray jsonArray = jsonObject.getJSONArray("courses");
//            for(int i = 0; i < jsonArray.length(); i++)
//            {
//                courses.add(jsonArray.getString(i));
//            }

//            JSONTokener Tooker=new JSONTokener(courseString);
            JSONObject arr=new JSONObject(courseString);
            String jb=arr.getString("elements");
            JSONArray arrs=new JSONArray(jb);
            for(int i = 0; i < arrs.length(); i++)
            {
                JSONObject tmp=(JSONObject)arrs.get(i);
                courses.get(i).setName(tmp.getString("name"));
                courses.get(i).setWorkloads(tmp.getString("Workloads"));
                courses.get(i).setUniversities(tmp.getString("Universities"));
                courses.get(i).setSmallIcon(tmp.getString("SmallIcon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }
}
