package com.example.drawertest.ui.classique;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.drawertest.CalculiClass;
import com.example.drawertest.R;
import com.example.drawertest.databinding.FragmentClassiqueBinding;

import org.w3c.dom.Text;

public class ClassiqueFragment extends Fragment {

    private FragmentClassiqueBinding binding;

    private static TextView calcul;
    private static TextView result;
    public static CalculiClass eval;
    public static int result_of_calc=0;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonAddition;
    private Button buttonSoustraction;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private Button buttonEgale;
    private Button buttonParentheseDebut;
    private Button buttonParentheseFin;
    private Button buttonAC;
    private Button buttonBack;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ClassiqueViewModel homeViewModel =
                new ViewModelProvider(this).get(ClassiqueViewModel.class);

        binding = FragmentClassiqueBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        calcul = (TextView) root.findViewById(R.id.calcul);
        result = (TextView) root.findViewById(R.id.result);

        eval = new CalculiClass();

        button1 = (Button) root.findViewById(R.id.button1);
        button2 = (Button) root.findViewById(R.id.button2);
        button3 = (Button) root.findViewById(R.id.button3);
        button4 = (Button) root.findViewById(R.id.button4);
        button5 = (Button) root.findViewById(R.id.button5);
        button6 = (Button) root.findViewById(R.id.button6);
        button7 = (Button) root.findViewById(R.id.button7);
        button8 = (Button) root.findViewById(R.id.button8);
        button9 = (Button) root.findViewById(R.id.button9);
        buttonAddition = (Button) root.findViewById(R.id.buttonAddition);
        buttonSoustraction = (Button) root.findViewById(R.id.buttonSoustraction);
        buttonDivision = (Button) root.findViewById(R.id.buttonDivision);
        buttonMultiplication = (Button) root.findViewById(R.id.buttonMultiplication);
        buttonEgale = (Button) root.findViewById(R.id.buttonEgale);
        buttonParentheseDebut = (Button) root.findViewById(R.id.buttonParentheseDebut);
        buttonParentheseFin = (Button) root.findViewById(R.id.buttonParentheseFin);
        buttonAC = (Button) root.findViewById(R.id.buttonAC);
        buttonBack = (Button) root.findViewById(R.id.buttonBack);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "1";
                calcul.setText(text);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "2";
                calcul.setText(text);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "3";
                calcul.setText(text);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "4";
                calcul.setText(text);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "5";
                calcul.setText(text);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "6";
                calcul.setText(text);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "7";
                calcul.setText(text);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "8";
                calcul.setText(text);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "9";
                calcul.setText(text);
            }
        });
        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "+";
                calcul.setText(text);
            }
        });
        buttonSoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "-";
                calcul.setText(text);
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "*";
                calcul.setText(text);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "-";
                calcul.setText(text);
            }
        });
        buttonEgale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                calcul();
            }
        });
        buttonParentheseDebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + "(";
                calcul.setText(text);
            }
        });
        buttonParentheseFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString() + ")";
                calcul.setText(text);
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText("");
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = calcul.getText().toString();
                if (text == null || text.length() == 0) {
                    return;
                }
                Log.v("Alexia: before", (text));
                text = text.substring(0, text.length() - 1);
                Log.v("Alexia: after", (text));
                calcul.setText(text);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public static void calcul(){
        String text = calcul.getText().toString();
        if (text == null || text.length() == 0) {
            return;
        }
        result_of_calc = eval.evaluate(calcul.getText().toString());
        Log.v("Alexia:",Integer.toString(result_of_calc));
        result.setText(calcul.getText().toString()+" = "+Integer.toString(result_of_calc));
        calcul.setText("");
    }

}