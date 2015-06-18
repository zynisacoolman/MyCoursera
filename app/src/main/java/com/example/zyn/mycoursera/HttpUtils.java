package com.example.zyn.mycoursera;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by zyn on 15-6-18.
 */
public class HttpUtils {
    /**
     * @param path   请求的服务器URL地址
     * @param encode 编码格式
     * @return 将服务器端返回的数据转换成String
     */
    public static String sendGetMessage(String path, String encode) {
        String result = "";
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpGet httpGet = new HttpGet(path);
            HttpResponse httpResponse = httpClient.execute(httpGet);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                if (httpEntity != null) {
                    result = EntityUtils.toString(httpEntity, encode);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return result;
    }
}