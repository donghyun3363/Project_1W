package com.example.donghyunlee.project_1w;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.donghyunlee.project_1w.Myfragment.FirstFragment;
import com.example.donghyunlee.project_1w.Myfragment.FourthFragment;
import com.example.donghyunlee.project_1w.Myfragment.SecondFragment;
import com.example.donghyunlee.project_1w.Myfragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    final int ITEM_SIZE = 5;
    private static final String TAG = "Log_Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager) findViewById(R.id.vp);
        ImageButton btn_first = (ImageButton) findViewById(R.id.mn0);
        ImageButton btn_second = (ImageButton) findViewById(R.id.mn1);
        ImageButton btn_third = (ImageButton) findViewById(R.id.mn2);
        ImageButton btn_fourth = (ImageButton) findViewById(R.id.mn3);
        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0); //    첫번째 페이지 초기화
        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);
        btn_third.setOnClickListener(movePageListener);
        btn_third.setTag(2);
        btn_fourth.setOnClickListener(movePageListener);
        btn_fourth.setTag(3);
    }
            View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = (int) v.getTag();
            vp.setCurrentItem(tag);
        }
    };
    class pagerAdapter extends FragmentStatePagerAdapter {

        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new FirstFragment();
                case 1:
                    return new SecondFragment();
                case 2:
                    return new ThirdFragment();
                case 3:
                    return new FourthFragment();
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return 4;
        }
    }

    public void Cl_camera(View v)
    {
        Toast.makeText(this, "카메라", Toast.LENGTH_SHORT).show();
    }
    public void Cl_messanger(View v)
    {
        Toast.makeText(this, "메신저", Toast.LENGTH_SHORT).show();
    }
}
