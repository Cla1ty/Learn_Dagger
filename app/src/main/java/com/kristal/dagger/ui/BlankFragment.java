package com.kristal.dagger.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kristal.dagger.R;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;


public class BlankFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);

    }
}