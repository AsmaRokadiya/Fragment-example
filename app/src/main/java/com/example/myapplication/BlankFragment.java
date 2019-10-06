package com.example.myapplication;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener,communicator {

Button btn1;
EditText text1;
communicator com;

public BlankFragment (){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com= (communicator)getActivity();
        btn1=getActivity().findViewById(R.id.button);
        text1=getActivity().findViewById(R.id.editText);
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String str= text1.getText().toString();
        com.respond1(str);
    }

    @Override
    public void respond1(String data) {

    }

    @Override
    public void respond2(String data) {
        text1.setText(""+data);
    }
}
