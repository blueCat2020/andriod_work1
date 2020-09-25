package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Work3_2_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3_2);
        Intent intent=getIntent();
        float dollarRate=intent.getFloatExtra("dollar_rate_key",0.0f);
        float euroRate=intent.getFloatExtra("euro_rate_key",0.0f);
        float wonRate=intent.getFloatExtra("won_rate_key",0.0f);
        EditText dollar_view=findViewById(R.id.dolloar_value);
        EditText euro_view=findViewById(R.id.euro_value);
        EditText won_view=findViewById(R.id.won_value);
        dollar_view.setText(dollarRate+"");
        euro_view.setText(euroRate+"");
        won_view.setText(wonRate+"");
    }

    public void save(View view) {
        Intent intent=new Intent(this,Work3_Activity.class);
        EditText dollar_view=findViewById(R.id.dolloar_value);
        EditText euro_view=findViewById(R.id.euro_value);
        EditText won_view=findViewById(R.id.won_value);
        float dollarRate=Float.valueOf(dollar_view.getText().toString());
        float euroRate=Float.valueOf(euro_view.getText().toString());
        float wonRate=Float.valueOf(won_view.getText().toString());
        intent.putExtra("dollar_rate_key",dollarRate);
        intent.putExtra("euro_rate_key",euroRate);
        intent.putExtra("won_rate_key",wonRate);
        Log.i("Work3_2_Activity","save:\ndollarRate="+"\tdollarRate="+dollarRate+"\teuroRate+wonRate="+euroRate+wonRate);
        setResult(RESULT_OK,intent);
        finish();
    }

}