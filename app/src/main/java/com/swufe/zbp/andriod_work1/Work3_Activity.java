package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Work3_Activity extends AppCompatActivity {

    private static final String TAG ="Work3_Activity" ;
    float dollar_rate=0.4f;
    float euro_rate=0.3f;
    float won_rate=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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


    public void config_work3(View view) {
        Intent intent=new Intent(this,Work3_2_Activity.class);
        intent.putExtra("dollar_rate_key",dollar_rate);
        intent.putExtra("euro_rate_key",euro_rate);
        intent.putExtra("won_rate_key",won_rate);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                dollar_rate=data.getFloatExtra("dollar_rate_key",dollar_rate);
                euro_rate=data.getFloatExtra("euro_rate_key",euro_rate);
                won_rate=data.getFloatExtra("won_rate_key",won_rate);
            }

        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}