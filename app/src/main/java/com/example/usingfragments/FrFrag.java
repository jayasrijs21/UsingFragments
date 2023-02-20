package com.example.usingfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FrFrag extends Fragment {


EditText etNum1;
EditText etNum2;
Button btnAdd;
View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fr, container, false);

        etNum1 = rootView.findViewById(R.id.etNum1);
        etNum2 = rootView.findViewById(R.id.etNum2);
        btnAdd = rootView.findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(etNum1.getText().toString());
                int num2 = Integer.parseInt(etNum2.getText().toString());
                int answer = num1 + num2;

                Bundle bundle = new Bundle();
                bundle.putInt("value" , answer);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SeFrag secondFragment = new SeFrag();
                secondFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frame_container , secondFragment);
                fragmentTransaction.commit();


            }
        });

        return rootView;

    }
}