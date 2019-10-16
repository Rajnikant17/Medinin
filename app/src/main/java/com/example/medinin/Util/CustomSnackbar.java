package com.example.medinin.Util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.medinin.R;

public class CustomSnackbar {

    @SuppressLint("ResourceAsColor")
    public void customSnackbar(ViewGroup
                                       relativeLayout  , String str, Context context)
    {

        Snackbar snackbar = Snackbar
                .make(relativeLayout, str, Snackbar.LENGTH_LONG);
        View view = snackbar.getView();
        view.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        TextView mTextView = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            mTextView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        } else {
            mTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        }
        snackbar.show();
    }
}
