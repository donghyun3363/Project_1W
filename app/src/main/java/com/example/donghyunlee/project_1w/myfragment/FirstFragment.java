package com.example.donghyunlee.project_1w.myfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.donghyunlee.project_1w.Item;
import com.example.donghyunlee.project_1w.R;
import com.example.donghyunlee.project_1w.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 * 뷰플리퍼, 첫 프래그먼트
 */

public class FirstFragment extends Fragment{


    final int ITEM_SIZE = 4;
    private static final String TAG = "Log_Tag";
    public FirstFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // fragment_first xml 인플레터 후 뷰가져오기
        View v = inflater.inflate(R.layout.fragment_first, container, false);


        // item 셋팅
        List<Item> items = new ArrayList<>();
        Item[] item = new Item[ITEM_SIZE];
        item[0] = new Item(R.drawable.img_title, R.drawable.img_content, "1시간", "1,792개", "댓글 67개", "공유 11회",
                getContext().getString(R.string.title00), getContext().getString(R.string.content00));
        item[1] = new Item(R.drawable.img_title, R.drawable.img_content3, "13분", "2,132개", "댓글 926개", "공유 43회",
                getContext().getString(R.string.title01), getContext().getString(R.string.content01));
        item[2] = new Item(R.drawable.img_title2, R.drawable.img_content2, "어제 오후 1:00", "62개", "" +
                "댓글 32개", "공유 4회",
                getContext().getString(R.string.title02), getContext().getString(R.string.content02));
        item[3] = new Item(R.drawable.img_title3, R.drawable.img_content4, "어제 오후 9:40", "72개", "댓글 23개", "공유 13회",
                getContext().getString(R.string.title03), getContext().getString(R.string.content03));


        // ArayList에 추가
        for (int i = 0; i < 4; i++) {
            items.add(item[i]);
        }
        // 리사이클러뷰 생성 및 셋팅
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), items, R.layout.activity_main));
        return v;
    }


}
