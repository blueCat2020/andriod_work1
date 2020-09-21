package com.swufe.zbp.andriod_work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
        TextView oup=findViewById(R.id.work1_result);
        float temp=Float.valueOf(input.getText().toString());
        float tran_temp=(float) (32+temp*1.8);
        oup.setText(tran_temp+"华氏度");
    }
    public void  nextpage_btn(View view) {
        Log.i("main","nextpage_btn msg ...");


        setContentView(R.layout.activity_work2);
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

    public void A_btn1(View view) {
        Log.i("work2","work2_A_btn1 msg ...");
        TextView result_view=findViewById(R.id.A_label2);
        Button btn1=findViewById(R.id.A_btn1);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+3;
        result_view.setText(""+result);
    }

    public void A_btn2(View view) {
        Log.i("work2","work2_A_btn2 msg ...");
        TextView result_view=findViewById(R.id.A_label2);
        Button btn2=findViewById(R.id.A_btn2);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+2;
        result_view.setText(""+result);
    }

    public void A_btn3(View view) {
        Log.i("work2","work2_A_btn3 msg ...");
        TextView result_view=findViewById(R.id.A_label2);
        Button btn3=findViewById(R.id.A_btn3);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+1;
        result_view.setText(""+result);
    }

    public void B_btn1(View view) {
        Log.i("work2","work2_B_btn1 msg ...");
        TextView result_view=findViewById(R.id.B_label2);
        Button btn1=findViewById(R.id.B_btn1);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+3;
        result_view.setText(""+result);
    }

    public void B_btn2(View view) {
        Log.i("work2","work2_B_btn2 msg ...");
        TextView result_view=findViewById(R.id.B_label2);
        Button btn2=findViewById(R.id.B_btn2);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+2;
        result_view.setText(""+result);
    }

    public void B_btn3(View view) {
        Log.i("work2","work2_B_btn3 msg ...");
        TextView result_view=findViewById(R.id.B_label2);
        Button btn3=findViewById(R.id.B_btn3);
        int result=Integer.valueOf(result_view.getText().toString());
        result=result+1;
        result_view.setText(""+result);
    }

    public void work2_reset_btn(View view) {
        Log.i("work2","work2_reset_btn msg ...");
        TextView result_view_A=findViewById(R.id.A_label2);
        TextView result_view_B=findViewById(R.id.B_label2);
        result_view_A.setText("0");
        result_view_B.setText("0");
    }
}