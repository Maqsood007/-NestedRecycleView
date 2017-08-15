package com.kaimeramedia.githubentry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<DataClass> horizontalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView horizontal_recycler_view = (RecyclerView) findViewById(R.id.horizenatlScrollView);
        RecyclerView verticalScrollView = (RecyclerView) findViewById(R.id.verticalScrollView);
        horizontalList = new ArrayList<DataClass>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            horizontalList.add(new DataClass(
                    MyData.nameArray[i],
                    MyData.drawableArray[i]
            ));
        }
        CustomAdapterHorizenatol horizontalAdapter = new CustomAdapterHorizenatol(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);
        horizontal_recycler_view.setAdapter(horizontalAdapter);


        CustomAdapterVertical vertical = new CustomAdapterVertical(horizontalList);
        verticalScrollView.setNestedScrollingEnabled(false);
        verticalScrollView.setHasFixedSize(false);
        LinearLayoutManager verticallLayoutManagaer
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        verticalScrollView.setLayoutManager(verticallLayoutManagaer);
        verticalScrollView.setAdapter(vertical);

    }


}
