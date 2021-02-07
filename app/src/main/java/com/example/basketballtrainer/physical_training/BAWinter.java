package com.example.basketballtrainer.physical_training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.basketballtrainer.databinding.BaAgilityBinding;
import com.example.basketballtrainer.databinding.BaSummerBinding;
import com.example.basketballtrainer.databinding.BaWinterBinding;

public class BAWinter extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        BaWinterBinding binding = BaWinterBinding.inflate (inflater, container, false);

        return binding.getRoot();




    }
}
