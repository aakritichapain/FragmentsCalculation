package com.aakriti.fragmentscalculation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aakriti.fragmentscalculation.Fragments.AreaofCircleFragment;
import com.aakriti.fragmentscalculation.Fragments.AutomorphicFragment;
import com.aakriti.fragmentscalculation.Fragments.PalindromeFragment;
import com.aakriti.fragmentscalculation.Fragments.SimpleInterestFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button  btnAutomorphic, btnPalindrome, btnAreaofCircle, btnSimpleInterest;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnAreaofCircle= findViewById(R.id.btnAreaofCircle);
        btnSimpleInterest= findViewById(R.id.btnSimpleInterest);

        btnAutomorphic.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnAreaofCircle.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnAreaofCircle:
                AreaofCircleFragment areaofCircleFragment = new AreaofCircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, areaofCircleFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnSimpleInterest:
                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterestFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;




        }

       /* if (status) {
            PalindromeFragment palindromeFragment = new PalindromeFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, palindromeFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            //btnArea.setText("");
            status = false;
        }elseif {
            AutomorphicFragment automorphicFragment = new AutomorphicFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, automorphicFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            //btnArea.setText("");
            status = true;
        }elseif {
            AreaofCircleFragment areaofCircleFragment = new AreaofCircleFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, areaofCircleFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            //btnArea.setText("");
            status = true;
        }
*/
    }
}
