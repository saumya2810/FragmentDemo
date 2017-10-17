package com.example.saumya.myapplication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.saumya.myapplication.R;

public class Fragment1 extends Fragment {
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1, container, false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstance){
        super.onActivityCreated(savedInstance);

        button=(Button)getActivity().findViewById(R.id.Clickme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Clicked me", Toast.LENGTH_SHORT).show();
            }
        });
    }

        }




