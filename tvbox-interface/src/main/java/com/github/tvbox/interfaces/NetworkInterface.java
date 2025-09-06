package com.github.tvbox.interfaces;

public interface NetworkInterface {
    void get(String url, NetworkCallback callback);
    void post(String url, String body, NetworkCallback callback);
    
    interface NetworkCallback {
        void onSuccess(String response);
        void onFailure(String error);
    }
}