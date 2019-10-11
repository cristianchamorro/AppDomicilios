package com.alejandro.domicilios.ui.home;

import android.os.Bundle;
import android.util.Log;
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
import com.alejandro.domicilios.PlatosAdapter;
import com.alejandro.domicilios.R;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    ManagerPlatos mPlatos = new ManagerPlatos();
    ArrayList<Platos>listaPlatos;
    RecyclerView recyclerPlatos;
    PlatosAdapter adaptadorPlatos;
    LinearLayoutManager layoutManager;
    Platos adaptador;

    //Objeto fireStore
    FirebaseFirestore mfirestore;
    public HomeFragment() {
    }

    public View onCreateView
            (@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
     View view = inflater.inflate(R.layout.fragment_home, container, false);

     listaPlatos=new ArrayList<>();
     recyclerPlatos= (RecyclerView) view.findViewById(R.id.recyclerId);
     recyclerPlatos.setLayoutManager(new LinearLayoutManager(getContext()));
     mfirestore = FirebaseFirestore.getInstance();

         Query query = mfirestore.collection("Platos").whereEqualTo("Producto","Hamburguesa");

        FirestoreRecyclerOptions<Platos> firestoreRecyclerOptions = new FirestoreRecyclerOptions.
                Builder<Platos>().// Paso la clase
                setQuery(query,Platos.class). //paso la consulta y la clase platos
                build();//Utilizo un buil

        adaptadorPlatos =new PlatosAdapter(firestoreRecyclerOptions);
        adaptadorPlatos.notifyDataSetChanged();
        recyclerPlatos.setAdapter(adaptadorPlatos);

        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        adaptadorPlatos.startListening();
    }


    @Override
    public void onStop() {
        super.onStop();
        adaptadorPlatos.stopListening();
    }

    //recycler view propiedades para mostrar

}