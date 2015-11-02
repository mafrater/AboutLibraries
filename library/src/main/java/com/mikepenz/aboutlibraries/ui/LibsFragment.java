package com.mikepenz.aboutlibraries.ui;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikepenz.aboutlibraries.LibsFragmentCompat;

/**
 * Created by mikepenz on 04.06.14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LibsFragment extends Fragment {

    private LibsFragmentCompat libsFragmentCompat;

    public LibsFragment() {
        libsFragmentCompat = new LibsFragmentCompat();
    }

    @Override
    public void onAttach(Context context) {
        libsFragmentCompat.onAttach(context, getArguments());
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return libsFragmentCompat.onCreateView(container.getContext(), inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        libsFragmentCompat.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        libsFragmentCompat.onDestroyView();
        super.onDestroyView();
    }
}
