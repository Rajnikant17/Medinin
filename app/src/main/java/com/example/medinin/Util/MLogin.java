package com.example.medinin.Util;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MLogin implements Serializable {
    @SerializedName("mobileno")
    @Expose
    String mobileno;

    @SerializedName("password")
    @Expose
    String password;

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
