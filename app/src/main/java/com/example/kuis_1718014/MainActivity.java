package com.example.kuis_1718014;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Julito", "Ayah", R.drawable.ayah));
        keluargaArrayList.add(new Keluarga("Ekariasi", "Ibu", R.drawable.ibu));
        keluargaArrayList.add(new Keluarga("Andy Febrianto", "Anak", R.drawable.andy));
        keluargaArrayList.add(new Keluarga("Ade Dwi Cahyanto", "Anak", R.drawable.dwi));
        keluargaArrayList.add(new Keluarga("Andani Fita Laura", "Anak", R.drawable.laura));
    }
}