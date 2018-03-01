package com.riti.test_refresh_up_down;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.RecyclerView;

import com.riti.test_refresh_up_down.adapter.RefreshAdapter;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    private RefreshAdapter adapter;

    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.rv);
        names=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("ban"+i);
        }
        adapter=new RefreshAdapter(this);
        adapter.setList(names);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(adapter);

    }
}
