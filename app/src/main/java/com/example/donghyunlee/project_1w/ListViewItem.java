package com.example.donghyunlee.project_1w;

/**
 * Created by DONGHYUNLEE on 2017-07-07.
 */

public class ListViewItem {
    public int profilDrawable;
    public String titleStr;
    public String dateStr;

    public ListViewItem(int profilDrawable, String titleStr, String dateStr){
        this.profilDrawable = profilDrawable;
        this.titleStr = titleStr;
        this.dateStr = dateStr;
    }

    public int getProfilDrawable() {
        return this.profilDrawable;
    }

    public String getTitleStr() {
        return titleStr;
    }

    public String getDateStr() {
        return dateStr;
    }


}
