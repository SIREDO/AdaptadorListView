package com.activitats.silvia.adaptadorlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Silvia on 28/10/2015.
 */
public class Inicio extends Activity {
    final String[] datos = new String [] {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
    private ListView lv_dias;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_lista);

        //definimos los elementos de la lista
        ArrayList<Element> datosLista =new ArrayList<Element>();
        datosLista.add(new Element(R.drawable.pumpkin_amazed,"Lunes",R.drawable.pumpkin_amazed));
        datosLista.add(new Element(R.drawable.pumpkin_angry,"Martes",R.drawable.pumpkin_angry));
        datosLista.add(new Element(R.drawable.pumpkin_in_love,"Miércoles",R.drawable.pumpkin_in_love));
        datosLista.add(new Element(R.drawable.pumpkin_happy,"Jueves",R.drawable.pumpkin_happy));
        datosLista.add(new Element(R.drawable.pumpkin_winking,"Viernes",R.drawable.pumpkin_winking));

        //Obtenemos el objeto ListView del xml y le establecemos como adaptador, el nuestro (AdaptadorLista)
        lv_dias = (ListView) findViewById(R.id.lvLista);

        lv_dias.setAdapter(new AdaptadorLista(this, R.layout.activity_element, datosLista) {
            @Override
            public void onEntrada(Object entrada, View view) {
               if(entrada!=null){
                    ImageView imagen1 =(ImageView) view.findViewById(R.id.iv1);
                    if (imagen1!=null)
                        imagen1.setImageResource(((Element) entrada).getIdImagen1());

                    TextView texto_dia = (TextView) view.findViewById(R.id.tvdia);
                    if(texto_dia!=null)
                        texto_dia.setText(((Element) entrada).getTextoDia());

                    ImageView imagen2 =(ImageView) view.findViewById(R.id.iv2);
                    if (imagen2!=null)
                        imagen2.setImageResource(((Element) entrada).getIdImagen2());
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_inicio, menu);
        return true;
    }

}
