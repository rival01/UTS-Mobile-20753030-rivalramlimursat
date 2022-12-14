package com.val.game;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopupFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_param1 = "param1";
    private static final String ARG_param2 = "param2";

    // TODO: Rename and change types of parameters
    private String mparam1;
    private String mparam2;

    public TopupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoppingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopupFragment newInstance(String param1, String param2) {
        TopupFragment fragment = new TopupFragment();
        Bundle args = new Bundle();
        args.putString(ARG_param1, param1);
        args.putString(ARG_param2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mparam1 = getArguments().getString(ARG_param1);
            mparam2 = getArguments().getString(ARG_param2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topup, container, false);
    }
}