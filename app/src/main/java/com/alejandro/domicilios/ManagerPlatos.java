package com.alejandro.domicilios;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ManagerPlatos {

    //creo instancia de la base de datos

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String mensaje="";
    CollectionReference collectionReference = db.collection("Platos");

    //LISTA PLATOS
    List<Platos> listPlat = new ArrayList<>();

    //INSTANCIA POJO PLATOS

    Platos plato = new Platos();



    //Metodo para agregar un plato

    public  String agregarPlato(Platos plato){

        /*Creo la coleccion llamando la clase Plato,
        hace de tabla en la base de datos*/

        db.collection("Platos").document().set(plato).
                addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

                mensaje="Plato agregado exitosamente";

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                mensaje= "Plato no agregado";
                Log.d("Mensaje",e.toString());
            }
        });

        return mensaje;
    }



    public List<Platos>listarHamburguesas(){

        collectionReference.whereEqualTo("Producto","Hambugersa").
                get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                for (QueryDocumentSnapshot queryDocumentSnapshot: queryDocumentSnapshots
                ) {
                    plato = queryDocumentSnapshot.toObject(Platos.class);
                    listPlat.add(plato);
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Log.e("Mensaje",e.toString());
            }
        });

        return listPlat;
    }

    public List<Platos>listarPerros(){

        collectionReference.whereEqualTo("Producto","Perro").
                get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                for (QueryDocumentSnapshot queryDocumentSnapshot: queryDocumentSnapshots
                ) {
                    plato = queryDocumentSnapshot.toObject(Platos.class);
                    listPlat.add(plato);
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Log.e("Mensaje",e.toString());
            }
        });

        return listPlat;
    }



}
