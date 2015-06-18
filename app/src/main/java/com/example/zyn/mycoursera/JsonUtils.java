package com.example.zyn.mycoursera;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zyn on 15-6-18.
 */
public class JsonUtils {
    /***
     * @param courseString 从服务器上获取的Json数据
     * @return 解析JSON字符串数据，放入List<adapter>当中
     */
    public static List<String> parseCourses(String courseString) {
        List<String> courses = new ArrayList<String>();
        try {
//            JSONObject jsonObject = new JSONObject(courseString);
//            JSONArray jsonArray = jsonObject.getJSONArray("courses");
//            for(int i = 0; i < jsonArray.length(); i++)
//            {
//                courses.add(jsonArray.getString(i));
//            }
            JSONArray jsonarray = JSONArray.fromObject(json);
            System.out.println(jsonArray);
            List list = (List) JSONArray.toCollection(jsonarray, Person.class);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Person p = (Person) it.next();
                System.out.println(p.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return courses;
    }
}
