package com.example.basketballtrainer.fragments.shoting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.basketballtrainer.databinding.EdHookBinding;
import com.example.basketballtrainer.databinding.FragmentEShootingBinding;

public class EDHook extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        EdHookBinding binding = EdHookBinding.inflate (inflater, container, false);

        return binding.getRoot();




    }
}
