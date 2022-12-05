package com.example.drawertest.ui.clavier;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.drawertest.CalculiClass;
import com.example.drawertest.R;
import com.example.drawertest.databinding.FragmentClavierBinding;

public class ClavierFragment extends Fragment {

    private FragmentClavierBinding binding;
    private static EditText input;
    private static TextView result;
    public static CalculiClass eval;
    public static Integer result_of_calc=0;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ClavierViewModel galleryViewModel =
                new ViewModelProvider(this).get(ClavierViewModel.class);

        binding = FragmentClavierBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        eval = new CalculiClass();

        input = (EditText) root.findViewById(R.id.calc_input);
        input.requestFocus();

        result = (TextView) root.findViewById(R.id.result);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public static Integer calcul(){
        String text = input.getText().toString();
        if (text == null || text.length() == 0) {
            return 0;
        }
        result_of_calc = eval.evaluate(input.getText().toString());
        if (result_of_calc==null){
            return 1;
        }
        Log.v("Alexia:",Integer.toString(result_of_calc));
        result.setText(Integer.toString(result_of_calc));
        return 2;
    }
}