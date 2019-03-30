package com.example.ungdungdicho;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DschoAdapter extends ArrayAdapter<model> {
    private Context mContext;
    private List<model> list;
    private int mResource;
    public DschoAdapter( Context context, int resource,  List<model> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.list = objects;
        this.mResource = resource;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (viewHolder == null){
            convertView = LayoutInflater.from(mContext).inflate(mResource,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textViewtenhang = convertView.findViewById(R.id.mh_tv_Tenhang);
            viewHolder.textViewdonvi = convertView.findViewById(R.id.mh_tv_donvi);
            viewHolder.textViewgia = convertView.findViewById(R.id.mh_tv_gia);
            viewHolder.textViewkhoiluong = convertView.findViewById(R.id.mh_tv_khoiluong);
            viewHolder.textViewmieuta = convertView.findViewById(R.id.mh_tv_mieuta);
            viewHolder.ivDelete = convertView.findViewById(R.id.item_iv_delete);
            viewHolder.ivUpdate = convertView.findViewById(R.id.item_iv_update);
        }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        final model item = list.get(position);
        //  model item1 = getItem(position);
        viewHolder.textViewtenhang.setText(String.valueOf(item.getTenHang()));
        viewHolder.textViewdonvi.setText(String.valueOf(item.getDonvi()));
        viewHolder.textViewgia.setText(String.valueOf(item.getGia()));
        viewHolder.textViewkhoiluong.setText(String.valueOf(item.getKhoiluong()));
        viewHolder.textViewmieuta.setText(String.valueOf(item.getMieuta()));
        viewHolder.ivDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(item);
                notifyDataSetChanged();
            }
        });
        viewHolder.ivUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(mContext,UpChiTietActivity.class);
           intent.putExtra("UPDATEITEM",item);
               intent.putExtra("POS",position);
              mContext.startActivity(intent);
            }
        });

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,ChiTietActivity.class);
                intent.putExtra("CTDS",item);
                mContext.startActivity(intent);
            }
        });

        return convertView;
    }

    public class ViewHolder{
        TextView textViewtenhang;
        TextView textViewdonvi;
        TextView textViewgia;
        TextView textViewkhoiluong;
        TextView textViewmieuta;
        ImageView ivUpdate;
        ImageView ivDelete;
    }
}