package com.lwl.rxretrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView list;
    String[] interfaceName = {"rGetUser1","rGetUser2","rGetUser3","rGetUser4","rGetUser5","rGetUser6","rGetUser7",
    "rPostUser1","rPostUser2","rPostUser3", "rPutUser1"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,interfaceName);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String item = adapter.getItem(position);

        if(item.equals("rGetUser1")){
            RetrofitService.getInstance(getApplicationContext()).rGetUser1();
        }else if(item.equals("rGetUser2")){
            RetrofitService.getInstance(getApplicationContext()).rGetUser2();
        }else if(item.equals("rGetUser3")) {
            RetrofitService.getInstance(getApplicationContext()).rGetUser3(null,null);
        }
        else if(item.equals("rGetUser4")) {
            RetrofitService.getInstance(getApplicationContext()).rGetUser4(null,null);
        }else if(item.equals("rGetUser5")) {
            RetrofitService.getInstance(getApplicationContext()).rGetUser5();
        }else if(item.equals("rGetUser6")) {
            RetrofitService.getInstance(getApplicationContext()).rGetUser6();
        }else if(item.equals("rGetUser7")) {
            RetrofitService.getInstance(getApplicationContext()).rGetUser7(null);
        } else if(item.equals("rPostUser1")){
            RetrofitService.getInstance(getApplicationContext()).rPostUser1(null);
        }else if(item.equals("rPostUser2")){
            RetrofitService.getInstance(getApplicationContext()).rPostUser2(null);
        }else if(item.equals("rPostUser3")){
            RetrofitService.getInstance(getApplicationContext()).rPostUser3(null);
        }else if(item.equals("rPutUser1")){
            RetrofitService.getInstance(getApplicationContext()).rPutUser1(null);
        }

    }
}
