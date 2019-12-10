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

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingFragment extends Fragment implements View.OnClickListener {
    private EditText etSwapFirst, etSwapSecond;
    private TextView tvSwapping;
    private Button btnSwapping;


    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_swapping, container, false);
        etSwapFirst = view.findViewById(R.id.etSwapFirst);
        etSwapSecond = view.findViewById(R.id.etSwapSecond);
        tvSwapping = view.findViewById(R.id.tvSwapping);
        btnSwapping = view.findViewById(R.id.btnSwapping);

        btnSwapping.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int first, second;
        first = Integer.parseInt(etSwapFirst.getText().toString());
        second = Integer.parseInt(etSwapSecond.getText().toString());
        first= first+second;
        second=first-second;
        first=first-second;

        tvSwapping.setText("After swapping: " + " First no: " + first + " and Second no: " + second);

    }
}
