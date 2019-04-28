package com.example.exam3activity;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter1 extends Activity {
    private ListView listView;    //定义ListView用来获取到，布局文件中的ListView控件
    private String[] name = {"Lion","Monkey","Dog","Cat","Elephant","Tiger"} ;  //定义一个数组，作为数据
    private int[] images={R.drawable.lion,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant,R.drawable.tiger};
    private List<Map<String,Object>> list_map = new ArrayList<Map<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取布局文件中的ListView控件对象
        listView=(ListView)findViewById(R.id.listview);
        System.out.println("Listview----id:"+listView);
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> items = new HashMap<String, Object>(); //创建一个键值对的Map集合，用来存放名字和头像
            items.put("pic", images[i]);  //放入头像， 根据下标获取数组
            items.put("name", name[i]);      //放入名字， 根据下标获取数组
            list_map.add(items);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                SimpleAdapter1.this,
                list_map,
                R.layout.listview,
                new String[]{"pic", "name"},
                new int[]{R.id.pic, R.id.name});

        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast=Toast.makeText(SimpleAdapter1.this,name[position],Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

}
