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

    final int ITEM_SIZE = 4;
    private static final String TAG = "Log_Tag";
    public FirstFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_first, container, false);

        List<Item> items = new ArrayList<>();
        Item[] item = new Item[ITEM_SIZE];
//        (int title_image, int image, int time, int like, int commend, int share, String title, String content)
        item[0] = new Item(R.drawable.img_title, R.drawable.img_content, "1시간", "1,792개", "댓글 67개", "공유 11회", "인사이트", "메시 부부는 결혼식을 검소하게 치르기 위해 많은 노력을 기울였다.");
        item[1] = new Item(R.drawable.img_title, R.drawable.img_content3, "13분", "2,132개", "댓글 926개", "공유 43회", "인사이트", "만쉐~!!");
        item[2] = new Item(R.drawable.img_title2, R.drawable.img_content2, "어제 오후 1:00", "62개", "댓글 32개", "공유 4회", "닥치고취업님이 새로운 사진 7장을 추가했습니다.", "유행어제조기 원썬.jpg \n 렛미두잇어게인~ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
        item[3] = new Item(R.drawable.img_title3, R.drawable.img_content4, "어제 오후 9:40", "72개", "댓글 23개", "공유 13회", "독취사 - 독하게취업하는사람들님이 새로운 사진 15장을 추가했습니다.", "평화로운 중고나라 모음 ㅎ^ㅎ\n #직거래살인마\n #배꼽주의");

        for (int i = 0; i < 4; i++) {
            items.add(item[i]);
        }
        RecyclerView recyclerView = (RecyclerView) layout.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecyclerAdapter(getActivity(), items, R.layout.activity_main));
        return layout;
    }


}
