package com.example.donghyunlee.project_1w.myfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.donghyunlee.project_1w.ListViewAdapter;
import com.example.donghyunlee.project_1w.ListViewItem;
import com.example.donghyunlee.project_1w.R;

import java.util.ArrayList;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 * 뷰플리퍼, 두번째 프래그먼트
 */

public class SecondFragment extends Fragment{
    public SecondFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v =inflater.inflate(R.layout.fragment_second, container, false);

        // 리스트뷰 아이템 셋팅
        ArrayList<ListViewItem> items = new ArrayList<>();
        ListViewItem[] item = new ListViewItem[4];

        item[0] = new ListViewItem(R.drawable.img_profil1, "신우용님이 회원님의 친구 요청을 수락했습니다. ", "6월 7일");
        item[1] = new ListViewItem(R.drawable.img_profil2, "신우용님이 회원님의 친구 요청을 수락했습니다. ", "6월 7일");
        item[2] = new ListViewItem(R.drawable.img_profil3, "신우용님이 회원님의 친구 요청을 수락했습니다. ", "6월 7일");
        item[3] = new ListViewItem(R.drawable.img_profil4, "신우용님이 회원님의 친구 요청을 수락했습니다. ", "6월 7일");

        // ArayList에 추가
        for (int i = 0; i < 4; i++) {
            items.add(item[i]);
        }
        // 리스트뷰 생성
        ListView listview = (ListView) v.findViewById(R.id.friend_listview);
        listview.setAdapter(new ListViewAdapter(getActivity(), items, R.layout.friend_listview_item));
        return v;
    }

}
