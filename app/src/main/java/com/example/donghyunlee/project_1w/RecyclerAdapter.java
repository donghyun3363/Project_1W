package com.example.donghyunlee.project_1w;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    List<Item> items;
    int item_layout;
    String tag = null;
    public RecyclerAdapter(Context context, List<Item> items, int item_layout) {
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardview;
        ImageView image;
        ImageView image_title;
        TextView title;
        TextView content;
        TextView like;
        TextView share;
        TextView commend;
        TextView time;
        ImageButton expand;
        Button btn_like;
        Button btn_commend;
        Button btn_share;

        public ViewHolder(View itemView) {
            super(itemView);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
            image = (ImageView) itemView.findViewById(R.id.ct_content_img);
            image_title = (ImageView) itemView.findViewById(R.id.image_title);
            content = (TextView) itemView.findViewById(R.id.ct_content);
            title = (TextView) itemView.findViewById(R.id.ct_title);
            time = (TextView) itemView.findViewById(R.id.ct_ifo);
            like = (TextView) itemView.findViewById(R.id.like);
            commend = (TextView) itemView.findViewById(R.id.commend);
            share = (TextView) itemView.findViewById(R.id.share);
            expand = (ImageButton) itemView.findViewById(R.id.ct_expand);
            btn_like = (Button) itemView.findViewById(R.id.ct_favorite);
            btn_commend = (Button) itemView.findViewById(R.id.ct_commed);
            btn_share = (Button) itemView.findViewById(R.id.ct_share);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, null);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item item = items.get(position);
        Drawable drawable = ContextCompat.getDrawable(context, item.getImage());
        Drawable drawable2 = ContextCompat.getDrawable(context, item.getTitle_Image());
        holder.image_title.setBackground(drawable2);
        holder.image.setBackground(drawable);
        holder.title.setText(item.getTitle());
        holder.title.setTypeface(null, Typeface.BOLD);
        holder.content.setText(item.getContent());
        holder.content.setTypeface(null, Typeface.BOLD);
        holder.like.setText(item.getLike());
        holder.like.setTypeface(null, Typeface.BOLD);
        holder.commend.setText(item.getCommend());
        holder.commend.setTypeface(null, Typeface.BOLD);
        holder.share.setText(item.getShare());
        holder.share.setTypeface(null, Typeface.BOLD);
        holder.time.setText(item.getTime());
        holder.time.setTypeface(null, Typeface.BOLD);
        holder.btn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "좋아요", Toast.LENGTH_SHORT).show();
            }
        });
        holder.btn_commend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "댓글달기", Toast.LENGTH_SHORT).show();
            }
        });
        holder.btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "공유", Toast.LENGTH_SHORT).show();
            }
        });
        holder.expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(context, v);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.saveLink:
                                Toast.makeText(context, "링크저장", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.hideContent:
                                Toast.makeText(context, "게시물 숨기기", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.cancelFollow:
                                Toast.makeText(context, "팔로우 취소", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.contet119:
                                Toast.makeText(context, "이 게시물 신고하기", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.alarm:
                                Toast.makeText(context, "이 게시물에 대한 알림 설정", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return true;
                        }
                    }
                });
            }
        });
    }
    @Override
    public int getItemCount() {
        return this.items.size();
    }
}