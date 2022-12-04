package com.example.drawertest.ui.clavier;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.drawertest.R;
import com.example.drawertest.databinding.FragmentClavierBinding;

public class ClavierFragment extends Fragment {

    private FragmentClavierBinding binding;
    private EditText input;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ClavierViewModel galleryViewModel =
                new ViewModelProvider(this).get(ClavierViewModel.class);

        binding = FragmentClavierBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        input = (EditText) root.findViewById(R.id.calc_input);
        input.requestFocus();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}