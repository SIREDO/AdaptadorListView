package com.activitats.silvia.adaptadorlistview;

/**
 * Created by Silvia on 28/10/2015.
 */

/*Clase que contiene todos los datos necesarios para gestionar
 la información de un elemento del ListView*/
public class Element {
    private int idImagen1, idImagen2; //variable que guarda la referencia de una imagen
    private String textoDia; //variable para guardar el texto del día

    public Element(int idIm, String txt1, int idIm2){
        this.idImagen1= idIm;
        this.textoDia= txt1;
        this.idImagen2= idIm2;
    }

    //getters para recuperar los parámetros del constructor
    public int getIdImagen1(){
        return idImagen1;
    }
    public String getTextoDia(){
        return textoDia;
    }
    public int getIdImagen2(){
        return idImagen2;
    }
}
