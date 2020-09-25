package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private String[] activitys = { "Work0_Activity", "Work1_Activity", "Work2_Activity", "Work3_Activity", "Work3_2_Activity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, activitys );
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position,
                                    long id) {
                String select_activity= adapterView.getItemAtPosition(position)+"";
                Toast.makeText(MainActivity.this, "position="+position+"text="+select_activity,Toast.LENGTH_SHORT).show();
                AppCompatActivity activity;
                switch (select_activity){
                    case "Work0_Activity":
                        activity=new Work0_Activity();
                        break;
                    case "Work1_Activity":
                        activity=new Work1_Activity();
                        break;
                    case "Work2_Activity":
                        activity=new Work2_Activity();
                        break;
                    case "Work3_Activity":
                        activity=new Work3_Activity();
                        break;
                    case "Work3_2_Activity":
                        activity=new Work3_2_Activity();
                        break;
                    default:
                        activity=new AppCompatActivity();
                        break;
                }
                Intent intent =new Intent(MainActivity.this,activity.getClass());
                startActivity(intent);
            }
        });
    }



}