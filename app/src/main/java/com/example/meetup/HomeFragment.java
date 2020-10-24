package com.example.meetup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView mRecyclerView;
    MyAdapter_Home myAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myAdapter = new MyAdapter_Home(getContext(), getMyList());
        mRecyclerView.setAdapter(myAdapter);
        return view;


    }
    private ArrayList<Model_Home> getMyList()
    {
        ArrayList<Model_Home> models = new ArrayList<>();
        Model_Home m = new Model_Home();
        m.setTitle("Community Service");
        m.setDescription("Help the community in any way");
        models.add(m);
        m = new Model_Home();
        m.setTitle("Football Match");
        m.setDescription("Any players welcome");
        models.add(m);
        return  models;
    }
}
