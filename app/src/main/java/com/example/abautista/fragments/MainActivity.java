package com.example.abautista.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements FragmentA.interfazFragmentA,FragmentB.interfazFragmentB {
FragmentA fragmentA;
FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = FragmentA.newInstance();
        fragmentB = fragmentB.newInstance();

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction  =  fm.beginTransaction();
         fragmentTransaction.replace(R.id.frame_layout_a,fragmentA);
        fragmentTransaction.replace(R.id.frame_layout_b,fragmentB);
        fragmentTransaction.commit();

    }

    @Override
    public void enviarSaludo(String Mensaje, int Count, int id) {

        TextView tvTemp = fragmentB.getView().findViewById(R.id.tvdescriptionB);
        TextView tvCounb = fragmentB.getView().findViewById(R.id.tvCountB);
        tvCounb.setText(""+Count);
        tvTemp.setText(Mensaje);

    }

    @Override
    public void enviarSaludoA(String Mensaje, int Count, int id) {
        TextView tvTemB = fragmentA.getView().findViewById(R.id.tvdescription);
        TextView tvCount = fragmentA.getView().findViewById(R.id.tvCount);


        tvCount.setText(""+Count);
        tvTemB.setText(Mensaje);
    }
}
