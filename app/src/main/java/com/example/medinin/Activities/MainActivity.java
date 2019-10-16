package com.example.medinin.Activities;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.example.medinin.R;
import com.example.medinin.Util.ApiServiceClass;
import com.example.medinin.Util.MLogin;
import com.example.medinin.Util.MLoginResponse;
import com.example.medinin.Util.ModelForHomePage;
import com.example.medinin.Util.MyApplication;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.container)
    RelativeLayout rl_container;

    @Inject
    ApiServiceClass apiServiceClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        MyApplication.getAppComponent(this).inject(this);
        MLogin mLogin=new MLogin();
        mLogin.setMobileno("8372965282");
        mLogin.setPassword("navinakaur");
       /*ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getResources().getString(R.string.please_wait));
        SharedPreferences sharedPreferences=getSharedPreferences(getResources().getString(R.string.hospitalkonnect),MODE_PRIVATE); */
        apiServiceClass.getHomePage(mLogin)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<MLoginResponse>() {
                    @Override
                    public void onSuccess(MLoginResponse mLoginResponse ) {

                        if (false) {

                        } else {
                            Log.d("successfullydone","All is successfullydone");
                           /* if (modelForHomePage.getCode() == 500) {

                            } else if (modelForHomePage.getCode() == 200) {
                                Gson gson=new Gson();
                                SharedPreferences.Editor editor=sharedPreferences.edit();
                                String str_model_home_page=gson.toJson(modelForHomePage);
                                editor.putString("model_for_homepage",str_model_home_page);
                                editor.apply();
                                presenterForHomePage.sendapidataback(modelForHomePage);

                            } */
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
