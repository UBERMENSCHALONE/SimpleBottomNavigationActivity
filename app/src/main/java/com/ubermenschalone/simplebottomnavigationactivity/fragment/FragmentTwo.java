package com.ubermenschalone.simplebottomnavigationactivity.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ubermenschalone.simplebottomnavigationactivity.R;
import com.ubermenschalone.simplebottomnavigationactivity.SwitchFragment;

public class FragmentTwo extends Fragment implements View.OnClickListener {

    private SwitchFragment switchFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        return rootView;
    }
    @Override
    public void onClick(View v) {

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof SwitchFragment) {
            switchFragment = (SwitchFragment) context;
        }
    }

    public static FragmentTwo newInstance() {
        return new FragmentTwo();
    }

}