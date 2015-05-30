package com.example.android.horizontalpaging;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Pi on 25-May-15.
 */
public class f1 extends Fragment {

    public f1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        //Dummy just change the R.layout.f1 fragment in xml okay? add images and done... :)
        View rootView = inflater.inflate(R.layout.f1, container, false);
        return rootView;
    }
}