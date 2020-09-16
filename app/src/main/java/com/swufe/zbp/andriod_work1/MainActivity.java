package com.swufe.zbp.andriod_work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View view) {
        Log.i("main","btn1 msg ...");
        EditText input=findViewById(R.id.inp);
        TextView oup=findViewById(R.id.oup);
        float temp=Float.valueOf(input.getText().toString());
        float tran_temp=(float) (32+temp*1.8);
        oup.setText(tran_temp+"华氏度");
    }
}