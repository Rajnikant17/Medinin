package com.example.medinin.Util;

import com.example.medinin.Activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {
void inject(MainActivity mainActivity);
}
