package com.example.zyn.mycoursera;

//import org.json.JSONArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;





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
        try {
//            JSONObject jsonObject = new JSONObject(courseString);
//            JSONArray jsonArray = jsonObject.getJSONArray("courses");
//            for(int i = 0; i < jsonArray.length(); i++)
//            {
//                courses.add(jsonArray.getString(i));
//            }
            JSONObject object=JSONObject.fromObject(courseString);
            JSONArray jsonarray = JSONArray.fromObject(object);
            System.out.println(jsonarray);
            List list = (List) JSONArray.toCollection(jsonarray, courseBean.class);
            /**
             * 下面是测试环节
             * */
            Iterator it = list.iterator();
            while (it.hasNext()) {
                courseBean p = (courseBean) it.next();
                System.out.println(p.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return courses;
    }
}
