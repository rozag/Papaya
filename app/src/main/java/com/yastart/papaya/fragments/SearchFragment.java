package com.yastart.papaya.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yastart.papaya.R;

/**
 * Created by 123 on 04.04.2015.
 */
public class SearchFragment extends BaseFragment {

    public static SearchFragment newInstance() {
        SearchFragment pageFragment = new SearchFragment();
        return pageFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, null);

        return view;
    }

    @Override
    protected int getLayoutResourceIdentifier(){
        return R.layout.fragment_search;
    }

    @Override
    protected String getTitleToolBar(){
        return "Поиск";
    }
}
