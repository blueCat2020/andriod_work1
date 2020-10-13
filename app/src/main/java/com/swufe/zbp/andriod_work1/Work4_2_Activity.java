package com.swufe.zbp.andriod_work1;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Work4_2_Activity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3_2);
        sharedPreferences=getSharedPreferences("rate", Activity.MODE_PRIVATE);
        float dollarRate=sharedPreferences.getFloat("dollar_rate",0.0f);
        float euroRate=sharedPreferences.getFloat("euro_rate",0.0f);
        float wonRate=sharedPreferences.getFloat("won_rate",0.0f);

        EditText dollar_view=findViewById(R.id.dolloar_value);
        EditText euro_view=findViewById(R.id.euro_value);
        EditText won_view=findViewById(R.id.won_value);
        dollar_view.setText(dollarRate+"");
        euro_view.setText(euroRate+"");
        won_view.setText(wonRate+"");
    }

    public void save(View view) {
        EditText dollar_view=findViewById(R.id.dolloar_value);
        EditText euro_view=findViewById(R.id.euro_value);
        EditText won_view=findViewById(R.id.won_value);
        float dollarRate=Float.valueOf(dollar_view.getText().toString());
        float euroRate=Float.valueOf(euro_view.getText().toString());
        float wonRate=Float.valueOf(won_view.getText().toString());
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putFloat("dollar_rate",dollarRate);
        editor.putFloat("euro_rate",euroRate);
        editor.putFloat("won_rate",wonRate);
        editor.apply();
        Log.i("Work4_2_Activity","save:\ndollarRate="+dollarRate+"\teuroRate="+euroRate+"\t+wonRate="+wonRate);
        finish();
    }
}