package id.sch.smktelkom_mlg.project.xirpl4091827.hellobali;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.Adapter.CafeAdapter;
import id.sch.smktelkom_mlg.project.xirpl4091827.hellobali.Model.Cafe;

public class Cafeo extends AppCompatActivity {
    ArrayList<Cafe> mList = new ArrayList<>();
    CafeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewCafe);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new CafeAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeo);
    }

    private void fillData()
    {
        Resources resources = getResources();
        String [] arJudulCafe = resources.getStringArray(R.array.name);
        String [] arDeskripsi = resources.getStringArray(R.array.name);
        TypedArray cafe = resources.obtainTypedArray(R.array.picture);
        Drawable [] arfoto = new Drawable[cafe.length()];
        for (int i = 0; i < arfoto.length; i++)
        {
            BitmapDrawable bd = (BitmapDrawable) cafe.getDrawable(i);
            RoundedBitmapDrawable rbd =
                    RoundedBitmapDrawableFactory.create(getResources(),bd.getBitmap());
            rbd.setCircular(true);
            arfoto[i] = rbd;
        }
        cafe.recycle();

        for (int i = 0; i < arJudulCafe.length; i++)
        {
            mList.add(new Cafe(arJudulCafe[i],arDeskripsi[i],arfoto[i]));

        }
        mAdapter.notifyDataSetChanged();
    }
}
