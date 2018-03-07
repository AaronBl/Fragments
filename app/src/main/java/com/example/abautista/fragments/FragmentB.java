package com.example.abautista.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {
    private int countb = 0 ;
    interfazFragmentB interfazFragmentB;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        Button btn = view.findViewById(R.id.btnFragmentB);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countb++;
                interfazFragmentB.enviarSaludoA("hola fragmento A",countb,getId());
            }
        });


        return view;

    }


    public static FragmentB newInstance(){
        FragmentB fragmentB = new FragmentB();
        return fragmentB;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            interfazFragmentB = (interfazFragmentB) context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(context.toString()+
                    "debe implementar interfaceFragmentA");
        }

    }



    public interface  interfazFragmentB{
        public void enviarSaludoA(String Mensaje,int Count,int id);
    }


}
