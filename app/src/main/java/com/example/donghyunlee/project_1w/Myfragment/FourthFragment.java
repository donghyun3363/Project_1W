package com.example.donghyunlee.project_1w.Myfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.donghyunlee.project_1w.R;

/**
 * Created by DONGHYUNLEE on 2017-07-04.
 * 뷰플리퍼, 네번째 프래그먼트
 */
public class FourthFragment extends Fragment{

    public FourthFragment(){
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_fourth, container, false);
        return layout;
    }



}