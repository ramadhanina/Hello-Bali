package id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.Model.Cafe;
import id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.R;

/**
 * Created by ACER on 04/12/2016.
 */
public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.ViewHolder>
{

    ArrayList<Cafe> cafeList;
    public CafeAdapter(ArrayList<Cafe> cafeList)
    {
        this.cafeList = cafeList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Cafe cafe = cafeList.get(position);
        holder.tvJudulCafe.setText(cafe.judulCafe);
        holder.tvDeskripsi.setText(cafe.deskripsi);
        holder.ivFoto.setImageDrawable(cafe.foto);
    }

    @Override
    public int getItemCount()
    {
        if(cafeList!=null)
            return cafeList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvJudulCafe;
        TextView tvDeskripsi;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudulCafe = (TextView) itemView.findViewById(R.id.textViewJudulCafe);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
