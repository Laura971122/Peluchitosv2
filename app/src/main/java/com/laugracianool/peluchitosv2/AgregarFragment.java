package com.laugracianool.peluchitosv2;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class AgregarFragment extends Fragment {

    private EditText eNombre, eCódigo, eCantidad, ePrecio;
    private Button bGuardar;
    Comunicador interfaz;

    public AgregarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_agregar, container, false);

        eCódigo= view.findViewById(R.id.eCódigo);
        eNombre= view.findViewById(R.id.eNombre);
        eCantidad= view.findViewById(R.id.eCantidad);
        ePrecio= view.findViewById(R.id.ePrecio);
        bGuardar= view.findViewById(R.id.bGuardar);
        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaz.enviarDatos(eCódigo.getText().toString(),
                        eNombre.getText().toString(),
                        eCantidad.getText().toString(),
                        ePrecio.getText().toString());

            }
        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        interfaz = (Comunicador) activity;
    }
}

