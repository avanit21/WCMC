package com.example.pr8;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Prlistfragment extends Fragment {
    String prlist[] = {"PR1","PR2","PR3","PR4","PR5","PR6","PR7"};
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_prlistfragment, container, false);

        listView = (ListView) view.findViewById(R.id.prlist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                prlist

        );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Imgfragment txtfrag = (Imgfragment)getFragmentManager().findFragmentById(R.id.frag2);
                txtfrag.change(prlist[position]);
                Toast.makeText(getContext(), prlist[position], Toast.LENGTH_SHORT).show();
                listView.setSelector(android.R.color.holo_blue_dark);

            }
        });
        return view;
    }

}

