package com.alejandro.domicilios;
/*
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
*/
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
/*  extends FirestoreRecyclerOptions<Platos,AdaptadorPlatos.ViewHolder> */

public class AdaptadorPlatos{
/*

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewPlatos= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_platos,null,false);
        return new ViewHolder(viewPlatos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView EtiNombre,EtiDescripcion;
       ImageView fotoPlato;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            EtiNombre = itemView.findViewById(R.id.txt_nombre_producto);
            EtiDescripcion = itemView.findViewById(R.id.txt_desc_producto);
        }
    }


    //Este se encarga de alimentar el item list personajes
/*
    ArrayList<Platos>listaPlatos;
    public AdaptadorPlatos(ArrayList<Platos> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }





    @NonNull
    @Override
    public ViewHolderPlatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewPlatos= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_platos,null,false);
        return new ViewHolderPlatos(viewPlatos);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPlatos holder, int position) {

        holder.EtiNombre.setText(listaPlatos.get(position).getNombre_plato());
        holder.EtiDescripcion.setText(listaPlatos.get(position).getDescripcion_plato());
        holder.FotoPlato.setImageResource(listaPlatos.get(position).getImg_plato());


    }

    @Override
    public int getItemCount() {
        return listaPlatos.size();
    }


    public class ViewHolderPlatos extends RecyclerView.ViewHolder {

        TextView EtiNombre,EtiDescripcion;
        ImageView FotoPlato;

        public ViewHolderPlatos(@NonNull View itemView) {
            super(itemView);

            EtiNombre = (TextView) itemView.findViewById(R.id.txt_nombre_producto);
            EtiDescripcion = (TextView) itemView.findViewById(R.id.txt_desc_producto);
            FotoPlato = (ImageView) itemView.findViewById(R.id.imagen_producto);

        }
    }*/
}
