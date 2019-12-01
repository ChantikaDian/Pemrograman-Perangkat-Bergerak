package com.chantika.mylocalization;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_profile, container, false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_profile, null);

        TextView tvName = root.findViewById(R.id.tvName);
        TextView tvAddress = root.findViewById(R.id.tvAddress);
        TextView tvHobby = root.findViewById(R.id.tvHobby);
        TextView tvQuote = root.findViewById(R.id.tvQuote);
        tvName.setText(getResources().getString(R.string.name));
        tvAddress.setText(getResources().getString(R.string.address));
        tvHobby.setText(getResources().getString(R.string.hobby));
        tvQuote.setText(getResources().getString(R.string.quote));

        return root;
    }
}
