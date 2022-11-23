package com.example.baikiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CongAnAdapter extends RecyclerView.Adapter<CongAnAdapter.DataViewHolder>{
    private List<CongAn> congAnList;
    private Context context;

    public CongAnAdapter(List<CongAn> congAnList, Context context) {
        this.congAnList = congAnList;
        this.context = context;
    }

    @NonNull
    @Override
    public CongAnAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CongAnAdapter.DataViewHolder holder, int position) {
        CongAn congAn = congAnList.get(position);
        if(congAn == null){
            return;
        }
        holder.ten.setText(congAn.getTen());
        holder.capBac.setText(congAn.getCapBac());
        holder.noiCongTac.setText(congAn.getNoiCongTac());
        holder.quocGia.setText(congAn.getQuocGia());
        holder.soSao.setText(congAn.getSoSao());
        holder.anh.setImageResource(congAn.getAnh());
    }

    @Override
    public int getItemCount() {
        return congAnList == null ? 0 : congAnList.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView ten, capBac, noiCongTac, quocGia, soSao;
        private ImageView anh;

        public DataViewHolder(View itemView) {
            super(itemView);

            ten = (TextView) itemView.findViewById(R.id.ten);
            capBac = (TextView)  itemView.findViewById(R.id.capBac);
            noiCongTac = (TextView)  itemView.findViewById(R.id.noiCongTac);
            quocGia = (TextView)  itemView.findViewById(R.id.quocGia);
            soSao = (TextView)  itemView.findViewById(R.id.soSao);
            anh = (ImageView) itemView.findViewById(R.id.anh);
        }
    }
}
