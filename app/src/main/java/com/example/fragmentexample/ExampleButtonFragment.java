package com.example.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexample.databinding.FragmentExampleButtonBinding;


public class ExampleButtonFragment extends Fragment {

    FragmentExampleButtonBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentExampleButtonBinding.inflate(inflater);

        binding.btReplace.setOnClickListener(v -> {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();

            ft.replace(R.id.fragmentContainerView, new ExampleFragmentTwo());
            ft.commit();

        });


        return binding.getRoot();
    }
}