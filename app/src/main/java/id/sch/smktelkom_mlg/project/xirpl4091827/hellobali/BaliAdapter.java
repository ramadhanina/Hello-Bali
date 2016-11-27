package id.sch.smktelkom_mlg.project.xirpl4091827.hellobali;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Smktelkom on 11/27/2016.
 */
public class BaliAdapter extends RecyclerView.Adapter<BaliAdapter.ViewHolder>
{
    ArrayList<Bali> baliList;

    public BaliAdapter(ArrayList<Bali> baliList)
    {
        this.baliList = baliList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Bali bali = baliList.get(position);
        holder.tvJudul.setText(bali.judul);
        holder.ivFoto.setImageDrawable(bali.foto);
    }

    @Override
    public int getItemCount()
    {
        if (baliList!=null)
            return baliList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        }
    }
}
