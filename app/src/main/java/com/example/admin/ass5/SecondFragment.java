package com.example.admin.ass5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View; import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;

/** * A simple {@link Fragment} subclass. */

public class SecondFragment extends Fragment {
    public SecondFragment() {
        // Required empty public constructor
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button btnback = (Button)view.findViewById(R.id.button);
        btnback.setOnClickListener(new View.OnClickListener()
        {

            @Override public void onClick(View v) {
                swagFragment(new FirstFragment());
                }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    public void swagFragment(Fragment fragment){
    FragmentTransaction ft = getFragmentManager()
            .beginTransaction()
            .replace(R.id.content,fragment);
    ft.addToBackStack(null);
    ft.commit();
}
}