package com.example.basketballtrainer.physical_training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.basketballtrainer.databinding.BaSpeedAndAgilityBinding;
import com.example.basketballtrainer.databinding.FragmentBPhysicalBinding;

public class BASpeedAndAgility extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        BaSpeedAndAgilityBinding binding = BaSpeedAndAgilityBinding.inflate (inflater, container, false);

        return binding.getRoot();




    }
}
