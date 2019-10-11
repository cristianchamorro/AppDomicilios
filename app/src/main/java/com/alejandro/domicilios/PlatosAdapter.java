package com.alejandro.domicilios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class PlatosAdapter extends FirestoreRecyclerAdapter<Platos,PlatosAdapter.ViewHolder> {



    public PlatosAdapter(@NonNull FirestoreRecyclerOptions<Platos> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int i, @NonNull Platos platos) {

        /*holder nos va a dar acceso a cada una de las vistas  que tenga pruducto y descripcion*/

        holder.EtiNombre.setText(platos.getNombre_plato());
        holder.EtiDescripcion.setText(platos.getDescripcion_plato());
       // holder.fotoPlato.setI

    }

  /*
  * 1,crearemos una vista
  * 2,establecer los datos del textview */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_platos,viewGroup,false);

        return new ViewHolder(view);/*estamos diciendole a este adapter que me ocupe el item_list_platos */
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView EtiNombre,EtiDescripcion;
        ImageView fotoPlato;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            EtiNombre = itemView.findViewById(R.id.txt_nombre_producto);
            EtiDescripcion = itemView.findViewById(R.id.txt_desc_producto);
            //fotoPlato = itemView.findViewById(R.id.imagen_producto);
        }
    }
}
