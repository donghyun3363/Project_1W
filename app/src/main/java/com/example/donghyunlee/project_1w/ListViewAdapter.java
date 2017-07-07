package com.example.donghyunlee.project_1w;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.donghyunlee.project_1w.R.layout.friend_listview_item;

/**
 * Created by DONGHYUNLEE on 2017-07-07.
 * 리스트 뷰 어댑터 클래스, 리스트 데이터 item을 액티비티에 뿌려주는 것
 */
public class ListViewAdapter extends BaseAdapter{

    Context context;
    List<ListViewItem> items;
    int item_layout;

    public ListViewAdapter(Context context, List<ListViewItem> items, int item_layout){
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }

    @Override
    public int getCount() {
    // Adapter에 사용되는 데이터의 개수를 리턴
        return this.items.size();
    }
    @Override
    public Object getItem(int position) {
        // 지정한 위치(position)에 있는 데이터를 리턴
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        // 지정하 위치(position)에 있는 데이터와 관계된 아이템(row)의 id를 리턴
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){    // 인프레터
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(friend_listview_item, parent, false);
        }

        Context context = parent.getContext();
        ListViewItem item = items.get(position);

        // 아이템 Setting
        ImageView imageview = (ImageView) convertView.findViewById(R.id.friend_imageview);
        TextView textView = (TextView) convertView.findViewById(R.id.friend_textview);
        Drawable drawable = ContextCompat.getDrawable(context, item.getProfilDrawable());
        imageview.setImageDrawable(drawable);
        textView.setText(item.getTitleStr());

        return convertView;
    }
}
