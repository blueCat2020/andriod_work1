package com.swufe.zbp.andriod_work1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Date;
import java.util.Map;

public class AlarmReceiver extends BroadcastReceiver{
    private static final String TAG = "AlarmReceiver";
    private  SharedPreferences sharedPreferences=null;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "run: onReceive()");
        //
        sharedPreferences=context.getSharedPreferences("countryRate",Activity.MODE_PRIVATE);
        Handler handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {

                AlarmReceiver.this.updateRate(sharedPreferences,msg);
                super.handleMessage(msg);

            }
        };
        Thread t=new Thread(new MyThread(handler));
        t.start();
        Intent i = new Intent(context,LongRunningService.class);
        context.startService(i);

    }
    private void updateRate(SharedPreferences sharedPreferences,Message msg){
        SharedPreferences.Editor editor = sharedPreferences.edit();//获取Editor
        editor.clear();
        editor.commit();
        Log.i(TAG, "清空原汇率数据");
        if(msg.what==5){
            Map<String,Float> data=(Map<String,Float> )msg.obj;
            for(Map.Entry<String,Float> entry : data.entrySet()){
                editor.putFloat(entry.getKey(),entry.getValue());
            }
            editor.commit();//提交修改
            Log.i(TAG, "更新汇率成功");

        }

    }

}