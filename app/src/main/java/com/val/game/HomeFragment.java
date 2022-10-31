package com.val.game;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.val.game.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvGame;
    private ArrayList<Topup> list = new ArrayList<>();

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rvGame = view.findViewById(R.id.rv_game);
        rvGame.setHasFixedSize(true);

        list.addAll(getListGame());
        showRecyclerList();

    }

    public ArrayList<Topup> getListGame() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        ArrayList<Topup> listGame = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Topup Game = new Topup();
            Game.setName(dataName[i]);
            Game.setDescription(dataDescription[i]);
            Game.setPhoto(dataPhoto.getResourceId(i, -1));
            listGame.add(Game);
        }
        return listGame;
    }

    private void showRecyclerList() {
        rvGame.setLayoutManager(new LinearLayoutManager(getContext()));
        ListTopupAdapter listTopupAdapter = new ListTopupAdapter(list);
        rvGame.setAdapter(listTopupAdapter);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}