package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ApdapterLichHoc extends BaseAdapter {

    Context context;
    ArrayList<LichHoc> list;
    SQLiteDatabase database;
    ApdapterLichHoc adapter;
    String DATABASE_NAME = "quanlysinhvien.db";

    public ApdapterLichHoc(Context context, ArrayList<LichHoc> list, SQLiteDatabase database) {
        this.context = context;
        this.list = list;
        this.database = database;
    }
    public void setData(ArrayList<LichHoc> newData) {
        this.list = newData;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
