package com.example.rokabr.didilearnsomething;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

/**
 * Created by rokabr on 1/14/2016.
 */
public class SlagFragment extends Fragment {

    private DatePicker mDatePicker;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slag, container, false);
        mDatePicker = (DatePicker) view.findViewById(R.id.slag_date_picker);
        return view;


    }

}
