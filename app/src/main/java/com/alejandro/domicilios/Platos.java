package com.alejandro.domicilios;

public class Platos {

    private String nombre_plato;
    private String descripcion_plato;
    private int img_plato;

    public Platos(){
    }

    public Platos(String nombre_plato, String descripcion_plato, int img_plato) {
        this.nombre_plato = nombre_plato;
        this.descripcion_plato = descripcion_plato;
        this.img_plato = img_plato;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public Platos setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
        return this;
    }

    public String getDescripcion_plato() {
        return descripcion_plato;
    }

    public Platos setDescripcion_plato(String descripcion_plato) {
        this.descripcion_plato = descripcion_plato;
        return this;
    }

    public int getImg_plato() {
        return img_plato;
    }

    public Platos setImg_plato(int img_plato) {
        this.img_plato = img_plato;
        return this;
    }

    @Override
    public String toString() {
        return "Platos:" +
                "nombre_plato='" + nombre_plato + '\'' +
                ", descripcion_plato='" + descripcion_plato + '\'' +
                ", img_plato=" + img_plato +
                '}';
    }
}
