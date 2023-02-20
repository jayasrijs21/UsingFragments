package com.example.usingfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SeFrag extends Fragment {
    TextView tvSol;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_se, container, false);

       tvSol = view.findViewById(R.id.tvSol);
       Bundle bundle = this.getArguments();
       int disp = bundle.getInt("value");
       //tvSol.setText("answer");

       tvSol.setText(String.valueOf(disp));



       return view;

    }
}