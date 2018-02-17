package com.khania.khania_1202154350_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentMenu extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RecyclerViewAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Menu menu = new Menu(R.drawable.gambar1, "Mie Goreng", "Rp. 15.000", R.string.miegoreng);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar2, "Soup", "Rp. 11.000", R.string.soup);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar3, "Ayam Goreng", "Rp. 14.000", R.string.ayamgoreng);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar4, "Sate Ayam", "Rp. 16.000", R.string.sateayam);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar5, "Rendang Daging", "Rp. 20.000", R.string.rendang);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar6, "Opor Ayam", "Rp. 13.000", R.string.oporayam);
        menuList.add(menu);
        menu = new Menu(R.drawable.gambar7, "Tempe Goreng", "Rp. 5.000", R.string.tempegoreng);
        menuList.add(menu);
    }
}
