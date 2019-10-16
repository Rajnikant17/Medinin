package com.example.medinin.Util;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MLoginResponse implements Serializable {

    @SerializedName("code")
    @Expose
    int code;
    @SerializedName("bool")
    @Expose
    boolean bool;
    @SerializedName("msg")
    @Expose
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
