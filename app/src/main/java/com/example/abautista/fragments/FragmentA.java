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



public class FragmentA extends Fragment {


interfazFragmentA interfazFragmentA;
    public FragmentA() {

    }

    // TODO: Rename and change types and number of parameters
    public static FragmentA newInstance() {
        FragmentA fragment = new FragmentA();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);


    }
    public  int countA;
    TextView tvCount;
    Button btnFargamentA;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



                tvCount = view.findViewById(R.id.tvCount);
                btnFargamentA = view.findViewById(R.id.btnFragmentA);



        btnFargamentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countA++;
                interfazFragmentA.enviarSaludo("hola fragmento b",countA,getId());
            }
        });


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

         try {
             interfazFragmentA = (interfazFragmentA) context;
         }
         catch (ClassCastException e){
             throw new ClassCastException(context.toString()+
             "debe implementar interfaceFragmentA");
         }

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


    public interface  interfazFragmentA{
        public void enviarSaludo(String Mensaje,int Count,int id);
    }




}
