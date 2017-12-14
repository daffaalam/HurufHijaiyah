package com.daffaalam.hurufhijaiyah;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by X on 12/5/2017.
 */

public class ItemSamAdapter extends RecyclerView.Adapter<ItemSamAdapter.CustomViewHolder> {
    private ArrayList<ItemSamData> itemSamDataArrayList;

    ItemSamAdapter(HijaiyahSambungActivity hijaiyahSambungActivity, ArrayList<ItemSamData> itemSamData) {
        this.itemSamDataArrayList = itemSamData;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams params;
        params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        @SuppressLint("InflateParams") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hijaiyah_sambung, null);
        view.setLayoutParams(params);
        return new ItemSamAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.huruf.setText(itemSamDataArrayList.get(position).getHuruf());
        holder.awal.setText(itemSamDataArrayList.get(position).getAwal());
        holder.tengah.setText(itemSamDataArrayList.get(position).getTengah());
        holder.akhir.setText(itemSamDataArrayList.get(position).getAkhir());
    }

    @Override
    public int getItemCount() {
        return itemSamDataArrayList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView huruf, awal, tengah, akhir;

        CustomViewHolder(View itemView) {
            super(itemView);
            huruf = itemView.findViewById(R.id.huruf);
            awal = itemView.findViewById(R.id.awalc);
            tengah = itemView.findViewById(R.id.tengahc);
            akhir = itemView.findViewById(R.id.akhirc);
        }
    }
}
