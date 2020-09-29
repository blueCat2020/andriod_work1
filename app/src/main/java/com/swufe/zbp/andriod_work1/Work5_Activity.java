package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Work5_Activity extends AppCompatActivity {
    private static String TAG="Work5_Activity";
    float dollar_rate=0.146f;
    float euro_rate=0.125f;
    float won_rate=171.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3);
        Handler handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if(msg.what==5){
                   // String str=(String)msg.obj;
                    //Log.i(TAG," handleMessage:getMessage msg="+str);
                    HashMap<String,Float> data=( HashMap<String,Float> )msg.obj;
                    Log.i(TAG,"美元"+data.get("美元"));
                    Log.i(TAG,"欧元"+data.get("欧元"));
                    Log.i(TAG,"韩元"+data.get("韩国元"));
                    dollar_rate=100/data.get("美元");
                    euro_rate=100/data.get("欧元");
                    won_rate=100/data.get("韩国元");

                }

                super.handleMessage(msg);
            }
        };
        Thread t=new Thread(new MyThread(handler));
        t.start();

    }
    public void btn1_work3(View view) {
        Log.i("work3","btn1_work3 msg ...");
        EditText input_view=findViewById(R.id.input_work3);
        TextView result_view=findViewById(R.id.result_work3);
        float input=0.0f,result;
        if(input_view.getText().toString().isEmpty()){
            Toast.makeText(this, "输入值不能为空", Toast.LENGTH_SHORT).show();

        }else{
            input=Float.parseFloat(input_view.getText().toString());
        }


        Log.i(TAG, "btn1_work3: dollarRate is "+dollar_rate);


        result=(float)(input*dollar_rate);
        result_view.setText(result+"");
    }

    public void btn2_work3(View view) {
        Log.i(TAG,"btn2_work3 msg ...");
        EditText input_view=findViewById(R.id.input_work3);
        TextView result_view=findViewById(R.id.result_work3);
        float input=0.0f,result;
        if("".equals(input_view.getText().toString())){
            Toast.makeText(this, "输入值不能为空", Toast.LENGTH_SHORT).show();

        }else{
            input=Float.parseFloat(input_view.getText().toString());
        }


        Log.i(TAG, "btn2_work3: euroRate is "+euro_rate);
        result=(float)(input*euro_rate);
        result_view.setText(result+"");

    }

    public void btn3_work3(View view) {
        Log.i("work3","btn3_work3 msg ...");
        EditText input_view=findViewById(R.id.input_work3);
        TextView result_view=findViewById(R.id.result_work3);
        float input=0.0f,result;
        if("".equals(input_view.getText().toString())){
            Toast.makeText(this, "输入值不能为空", Toast.LENGTH_SHORT).show();

        }else{
            input=Float.valueOf(input_view.getText().toString());
        }


        Log.i(TAG, "btn2_work3: euroRate is "+won_rate);


        result=(float)(input*won_rate);
        result_view.setText(result+"");
    }



}