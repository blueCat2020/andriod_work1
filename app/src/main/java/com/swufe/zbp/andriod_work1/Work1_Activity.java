package com.swufe.zbp.andriod_work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Work1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);
    }
    public void work1_btn1(View view) {
        Log.i("work1","work1_btn1 msg ...");
        TextView result_view=findViewById(R.id.work1_result);
        Button btn1=findViewById(R.id.work1_btn1);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+3;
        result_view.setText(""+result);
    }
    public void work1_btn2(View view) {
        Log.i("work1","work1_btn2 msg ...");
        TextView result_view=findViewById(R.id.work1_result);
        Button btn1=findViewById(R.id.work1_btn1);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+2;
        result_view.setText(""+result);
    }
    public void work1_btn3(View view) {
        Log.i("work1","work1_btn3 msg ...");
        TextView result_view=findViewById(R.id.work1_result);
        Button btn1=findViewById(R.id.work1_btn1);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+1;
        result_view.setText(""+result);
    }
    public void work1_btn4(View view) {
        Log.i("work1","work1_btn4 msg ...");
        TextView result_view=findViewById(R.id.work1_result);
        result_view.setText("0");

    }

}