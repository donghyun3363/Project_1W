package com.example.donghyunlee.project_1w.Myfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.donghyunlee.project_1w.Item;
import com.example.donghyunlee.project_1w.R;
import com.example.donghyunlee.project_1w.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 */

public class FirstFragment extends Fragment{

    final int ITEM_SIZE = 5;
    private static final String TAG = "Log_Tag";
    public FirstFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_first, container, false);

        List<Item> items = new ArrayList<>();
        Item[] item = new Item[ITEM_SIZE];
        item[0] = new Item(R.drawable.img_content, "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        item[1] = new Item(R.drawable.img_content, "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        item[2] = new Item(R.drawable.img_content, "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        item[3] = new Item(R.drawable.img_content, "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        item[4] = new Item(R.drawable.img_content, "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        for (int i = 0; i < ITEM_SIZE; i++) {
            items.add(item[i]);
        }
        RecyclerView recyclerView = (RecyclerView) layout.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerAdapter(getActivity().getApplicationContext(), items, R.layout.activity_main));
        return layout;
    }


}
