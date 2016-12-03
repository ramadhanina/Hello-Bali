package Adapter;

import android.app.VoiceInteractor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Model.OptionClass;
import id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.R;

/**
 * Created by ACER on 03/12/2016.
 */
public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.ViewHolder>
{
    ArrayList<OptionClass> optionList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        OptionClass option = optionList.get(position);
        holder.tvJudul.setText(option.judul);
        holder.tvDeskripsi.setText(option.deskripsi);
        holder.ivFoto.setImageDrawable(option.foto);
    }

    @Override
    public int getItemCount() {
        if(optionList!=null)
            return optionList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
    public OptionAdapter(ArrayList<OptionClass> optionList)
    {
        this.optionList = optionList;
    }
}

