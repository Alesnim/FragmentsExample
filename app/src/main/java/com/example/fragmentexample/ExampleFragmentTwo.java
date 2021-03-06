package com.example.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexample.databinding.FragmentExampleOneBinding;
import com.example.fragmentexample.databinding.FragmentExampleTwoBinding;

public class ExampleFragmentTwo extends Fragment {

    FragmentExampleTwoBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentExampleTwoBinding.inflate(inflater);
        return binding.getRoot();
    }
}