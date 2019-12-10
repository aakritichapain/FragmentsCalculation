package com.aakriti.fragmentscalculation.Fragments;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
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
public class PalindromeFragment extends Fragment implements View.OnClickListener {

    EditText etnum;
    TextView tvmessage;
    Button btnPalindrome;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etnum = view.findViewById(R.id.etnum);
        tvmessage = view.findViewById(R.id.tvmessage);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etnum.getText())) {
            etnum.setError("Enter Something");
            ;
            return;
        }

        int r, sum = 0, temp;
        int n = Integer.parseInt(etnum.getText().toString());//It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
            if (temp == sum)
                tvmessage.setText("Palindrome Number");
            else
                tvmessage.setText("Not a Palindrome Number");

        }


    }
}
