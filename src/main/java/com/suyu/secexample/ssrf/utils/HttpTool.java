package com.suyu.secexample.ssrf.utils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

//URLConnection:可以走邮件、文件传输协议。
//HttpURLConnection 只能走浏览器的HTTP协议

public class HttpTool {
    public static Object httpRequest(String requestUrl) throws Exception {
        String htmlContent;
        URL url = new URL(requestUrl);
        URLConnection urlConnection = url.openConnection();
        //HttpURLConnection httpUrl = (HttpURLConnection) urlConnection;
        BufferedReader base = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
        StringBuffer html = new StringBuffer();
        while ((htmlContent = base.readLine()) != null) {
            html.append(htmlContent);
        }
        base.close();
        return html;
    }

    public static Object getHttpReuest(String requestUrl) throws Exception {
        return  httpRequest(requestUrl);
    }
}

