package id.sch.smktelkom_mlg.project.xirpl4091827.hellobali;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class OptionActivity extends AppCompatActivity {

    ArrayList<Option> mList = new ArrayList<>();
    OptionAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new OptionAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();
        private void fillData()
    {
        Resources resources = getResources();
        String [] arJudul = resources.getStringArray(R.array.places);
        String [] arDeskripsi = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable [] arFoto = new Drawable[cafe.length()];
        for (int i = 0; i < arFoto.length; i++)
        {
            arFoto[i] = cafe.getDrawable(i);
        }
        cafe.recycle();

        for (int i = 0; i < arJudul.length; i++)
        {
            mList.add(new OptionClass(arJudul[i], arDeskripsi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }
    }

