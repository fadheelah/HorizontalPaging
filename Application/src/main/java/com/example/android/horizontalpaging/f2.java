package com.example.android.horizontalpaging;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Pi on 25-May-15.
 */
public class f2 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public f2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.f2, container, false);
        return rootView;
    }
}