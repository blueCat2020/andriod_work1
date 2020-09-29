package com.swufe.zbp.andriod_work1;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MyThread implements Runnable{

    private static String TAG="MyThread";
    private Handler handler;
    public MyThread(Handler handler){
        this.handler=handler;
    }
    @Override
    public void run() {
        Log.i(TAG,"run:run()......");
        Message msg=handler.obtainMessage(5);
        //msg.obj="Hello from run()";
       // msg.obj=getHtmlString("https://www.swufe.edu.cn/");
        msg.obj=getData();
        handler.sendMessage(msg);
    }
    public String getHtmlString(String http_url){
        String html=null;
        try {
            URL url=new URL(http_url);
            HttpURLConnection http=(HttpURLConnection)url.openConnection();
            InputStream in =http.getInputStream();
            html=inputStream2String(in,"utf-8");
            Log.i(TAG,"getHtmlString:html="+html);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return html;
    }

    private String inputStream2String(InputStream inputStream,String charsetName) throws IOException {
        final int buffersize=1024;
        final char[] buffer=new char[buffersize];
        final StringBuffer out=new StringBuffer();
        Reader in =new InputStreamReader(inputStream,charsetName);
        while(true){
            int rsz =in.read(buffer,0,buffer.length);
            if(rsz<0)
                break;
            out.append(buffer,0,rsz);
        }
        return out.toString();
    }
    private Map<String,Float> getData(){
        String http_url="https://www.boc.cn/sourcedb/whpj/";
        Map<String, Float> map=new HashMap<>();
        try {
            Document doc= Jsoup.connect(http_url).get();
            Log.i(TAG," getData():"+doc.title());
            Elements tables=doc.getElementsByTag("table");
            Element data_Table=tables.get(1);
            Elements tds=data_Table.getElementsByTag("td");
            for(int i=0;i< tds.size();i=i+8){
                Element country=tds.get(i);
                Element rate=tds.get(i+5);
                map.put(country.text(),Float.valueOf(rate.text()));
                //Log.i(TAG,"getData():"+country.text()+"\t"+rate.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
