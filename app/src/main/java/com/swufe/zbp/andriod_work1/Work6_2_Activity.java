package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Work6_2_Activity extends AppCompatActivity {
    private static String TAG="Work6_2_Activity";
    private String country="国家";
    private float rate=0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work6_2);
        Intent intent=getIntent();
        country=intent.getStringExtra("country");
        rate=intent.getFloatExtra("rate",0.0f);
        TextView textView=findViewById(R.id.country_label);
        textView.setText(country);
        EditText money_rmb=findViewById(R.id.money_work6_2);
        money_rmb.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
               // Log.i("TextWatcher","输入之前");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Log.i("TextWatcher","正在输入");
            }

            @Override
            public void afterTextChanged(Editable s) {
                EditText money_rmb=findViewById(R.id.money_work6_2);
                Log.i("TextWatcher","输入之后");
                TextView result=findViewById(R.id.trans_result);
                float money=Float.parseFloat(money_rmb.getText().toString());
                result.setText(translate(money)+"");
            }


    });

    }
    private float translate(float money){

        return money*rate/100;
    }


}