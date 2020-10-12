package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work6_Activity extends AppCompatActivity {
    private static final String TAG ="Work6_Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work6);
        Handler handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {


                    //setRates1(msg);
                    setRates2(msg);



                super.handleMessage(msg);
            }
        };
        Thread t=new Thread(new MyThread(handler));
        t.start();


    }

    private void setRates1(Message msg) {
        List<String> rates=new ArrayList<String>();
        if(msg.what==5){
            Map<String,Float> data=(Map<String,Float> )msg.obj;
            for (String country :data.keySet()) {
                rates.add(country+"\t"+data.get(country));
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    Work6_Activity.this, android.R.layout.simple_list_item_1, rates);
            ListView listView = findViewById(R.id.list_view);
            listView.setAdapter(adapter);
        }

    }
    private void setRates2(Message msg) {
        List<HashMap<String,String>> rates=new ArrayList<HashMap<String,String>>();
        if(msg.what==5) {
            Map<String, Float> data = (Map<String, Float>) msg.obj;
            for (String country : data.keySet()) {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("country", country);
                map.put("rate", "" + data.get(country));
                rates.add(map);
            }
            ListAdapter adapter = new SimpleAdapter
                    (Work6_Activity.this, rates, R.layout.list_item_work6, new String[]{"country", "rate"}, new int[]{R.id.country, R.id.rate});
            ListView listView = findViewById(R.id.list_view);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position,
                                        long id) {
                    HashMap<String, String> select_rate = (HashMap<String, String>) adapterView.getItemAtPosition(position);

                    Intent intent = new Intent(Work6_Activity.this, Work6_2_Activity.class);
                    intent.putExtra("country", select_rate.get("country"));
                    intent.putExtra("rate", Float.valueOf(select_rate.get("rate")));
                    startActivity(intent);
                }
            });
        }

    }


}