package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements  communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond1(String data) {
        FragmentManager fm=getSupportFragmentManager();
        BlankFragment2 f2=(BlankFragment2)fm.findFragmentById(R.id.fragment2);
        f2.respond1(data);
    }

    @Override
    public void respond2(String data) {
    FragmentManager fm=getSupportFragmentManager();
    BlankFragment f1=(BlankFragment)fm.findFragmentById(R.id.fragment);
    f1.respond2(data);
    }
}
