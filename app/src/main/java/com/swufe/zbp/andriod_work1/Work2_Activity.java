package com.swufe.zbp.andriod_work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Work2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work2);
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