package com.aakriti.fragmentscalculation.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aakriti.fragmentscalculation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongNumberFragment extends Fragment implements View.OnClickListener {
    private EditText etnumA;
    private Button btnArmstrong;
    private TextView tvArmstrong;


    public ArmstrongNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong_number, container, false);
        etnumA = view.findViewById(R.id.etnumA);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);
        tvArmstrong = view.findViewById(R.id.tvArmstrong);
        btnArmstrong.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        int c = 0, a, temp;
        int n = 0;
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }

        if (temp == c) {
            tvArmstrong.setText("It is armstrong");
        } else {
            tvArmstrong.setText("It is not armstrong");
        }


        /*int a,cube,counter=1;
        int n=Integer.parseInt(etnumA.getText().toString());

        a=n;
        cube=n*n*n;
        while (n!=0)
        {
            counter= n % 10;
            counter=counter*counter*counter;
            n=n/10;
        }
        if(counter==a){

            tvArmstrong.setText("It is armstrong");

        }
        else{
            tvArmstrong.setText("It is not armstrong");
        }*/
    }
}