package com.swufe.zbp.andriod_work1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Work4_Activity extends AppCompatActivity {
    private static final String TAG ="Work4_1_Activity" ;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences=getSharedPreferences("rate", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putFloat("dollar_rate",0.4f);
        editor.putFloat("euro_rate",0.2f);
        editor.putFloat("won_rate",2);
        editor.apply();
        setContentView(R.layout.activity_work3);
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

        float dollar_rate=sharedPreferences.getFloat("dollar_rate",0.0f);
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

        float euro_rate=sharedPreferences.getFloat("euro_rate",0.0f);
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

        float won_rate=sharedPreferences.getFloat("won_rate",0.0f);
        Log.i(TAG, "btn2_work3: euroRate is "+won_rate);


        result=(float)(input*won_rate);
        result_view.setText(result+"");
    }


    public void config_work3(View view) {
        Intent intent=new Intent(this,Work4_2_Activity.class);
        startActivity(intent);
    }


}