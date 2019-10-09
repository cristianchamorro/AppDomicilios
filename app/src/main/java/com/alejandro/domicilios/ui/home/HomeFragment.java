package com.alejandro.domicilios.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alejandro.domicilios.AdaptadorPlatos;
import com.alejandro.domicilios.ManagerPlatos;
import com.alejandro.domicilios.Platos;
import com.alejandro.domicilios.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    ManagerPlatos mPlatos = new ManagerPlatos();
    ArrayList<Platos>listaPlatos;
    RecyclerView recyclerPlatos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        listaPlatos =new ArrayList<>();
        recyclerPlatos= (RecyclerView) root.findViewById(R.id.recyclerId);

        recyclerPlatos.setRecyclerListener(new RecyclerView.RecyclerListener() {
            @Override
            public void onViewRecycled(@NonNull RecyclerView.ViewHolder holder) {

            }
        });

        listarPlatos();
        AdaptadorPlatos adapterPlat = new AdaptadorPlatos(listaPlatos);
        recyclerPlatos.setAdapter(adapterPlat);



        final RecyclerView recyclerView = root.findViewById(R.id.recyclerId);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);


            }
        });
        return root;
    }


    private void listarPlatos() {

        //ArrayAdapter<Platos>adapter = new ArrayAdapter<>(HomeFragment.this,android.R.layout.simple_list_item_1,mPlatos.listarHamburguesas());

    }
}