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
public class BlankFragment2 extends Fragment  implements View.OnClickListener,communicator{

    Button btn2;
    EditText text2;
    communicator com2;
    public BlankFragment2 () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com2=(communicator)getActivity();
        btn2=getActivity().findViewById(R.id.button1);
        text2=getActivity().findViewById(R.id.editText1);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String str= text2.getText().toString();
        com2.respond2(str);
    }

    @Override
    public void respond1(String data) {
        text2.setText(""+data);
    }

    @Override
    public void respond2(String data) {

    }
}
