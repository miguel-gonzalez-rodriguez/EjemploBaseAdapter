package com.cidead.pmdm.ejemplobaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adaptador personalizado, extendiendo BaseAdapter, para la clase DatosPersonales
 */
public class DatosPersonalesAdaptador extends BaseAdapter {
    private Context context;
    private ArrayList<DatosPersonales> datosPersonales;

    public DatosPersonalesAdaptador(ArrayList<DatosPersonales> datosPersonales, Context context) {
        this.datosPersonales = datosPersonales;
        this.context = context;
    }

    @Override
    public int getCount() {
        return datosPersonales.size();
    }

    @Override
    public Object getItem(int position) {
        return datosPersonales.get(position);
    }

    @Override
    public long getItemId(int position) {
        // No he creado identificador en la clase DatosPersonales
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.item,null);
        TextView nombre = convertView.findViewById(R.id.textViewNombre);
        TextView apellidos = convertView.findViewById(R.id.textViewApellidos);
        nombre.setText(datosPersonales.get(position).getNombre());
        apellidos.setText(datosPersonales.get(position).getApellidos());

        return convertView;
    }
}
