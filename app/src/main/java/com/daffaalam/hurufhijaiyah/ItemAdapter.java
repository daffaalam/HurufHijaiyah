package com.daffaalam.hurufhijaiyah;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.CustomViewHolder> {

    private ArrayList<ItemData> itemDataArrayList;

    ItemAdapter(HijaiyahActivity hijaiyahActivity, ArrayList<ItemData> arrayList) {
        this.itemDataArrayList = arrayList;
    }

    @Override
    public ItemAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams params;
        params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        @SuppressLint("InflateParams") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hijaiyah, null);
        view.setLayoutParams(params);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.CustomViewHolder holder, int position) {
        holder.imageView.setImageResource(itemDataArrayList.get(position).getGambarHijaiyah());
        holder.textView.setText(itemDataArrayList.get(position).getHurufHijaiyah());
    }

    @Override
    public int getItemCount() {
        return itemDataArrayList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        CustomViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.gmbr);
            textView = itemView.findViewById(R.id.txt);
        }
    }
}
