package com.example.ju.a16haligongbaodaoxitong;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * A placeholder fragment containing a simple view.
 */
public class rongchengxiaoqu extends Fragment {

    public rongchengxiaoqu() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
        Glide.with(getActivity())
                .load(R.drawable.haligongxiaohui)
                .override(1000,1000)
                .centerCrop()
                .into(imageView);
        return rootView;
    }
}
