package com.swufe.zbp.andriod_work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private String[] activitys = { "Work0_Activity", "Work1_Activity", "Work2_Activity", "Work3_Activity","Work4_Activity","Work5_Activity","Work6_Activity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,LongRunningService.class);
        startService(intent);
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
                    case "Work4_Activity":
                        activity=new Work4_Activity();
                        break;
                    case "Work5_Activity":
                        activity=new Work5_Activity();
                        break;
                    case "Work6_Activity":
                        activity=new Work6_Activity();
                        break;
                    default:
                        activity=new MainActivity();
                        break;
                }
                Intent intent =new Intent(MainActivity.this,activity.getClass());
                startActivity(intent);
            }
        });

    }



}