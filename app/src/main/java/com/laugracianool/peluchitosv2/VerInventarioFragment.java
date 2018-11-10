package com.laugracianool.peluchitosv2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VerInventarioFragment extends Fragment {
    private TextView tInventario;
    public VerInventarioFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ver_inventario, container, false);
        tInventario = view.findViewById(R.id.tInventario);
        Bundle data = getArguments();
        tInventario.setText(data.getString("Nombre" + "," + "Código" + "," + "Cantidad" + "," + "Precio"));
        return view;
    }

}
