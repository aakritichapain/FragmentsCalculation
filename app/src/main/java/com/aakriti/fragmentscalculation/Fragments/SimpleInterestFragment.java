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
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {
    private Button btnSimpleInterest;
    private EditText etPrinciple, etRate, etTime;
    private TextView tvSimpleInterest;

    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etPrinciple= view.findViewById(R.id.etPrincipal);
        etRate= view.findViewById(R.id.etRate);
        etTime= view.findViewById(R.id.etTime);
        tvSimpleInterest= view.findViewById(R.id.tvSimpleInterest);
        btnSimpleInterest= view.findViewById(R.id.btnSimpleInterest);

        btnSimpleInterest.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(etPrinciple.getText().toString());
        int num2 = Integer.parseInt(etRate.getText().toString());
        int num = Integer.parseInt(etTime.getText().toString());

        int si = (num1 * num2 * num) / 100;
        tvSimpleInterest.setText("Simple Interest is: " + Integer.toString(si));

    }
}
