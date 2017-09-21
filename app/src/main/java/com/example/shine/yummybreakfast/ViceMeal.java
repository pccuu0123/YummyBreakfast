package com.example.shine.yummybreakfast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by first on 2017/5/8.
 */

public class ViceMeal extends Fragment{
    private static final  String TAG ="ViceMeal";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vicemeal,container,false);
        return view;
    }
}
