package com.github.tvbox.interfaces;

public interface PlayerInterface {
    void initialize();
    void playMedia(String url);
    void setCallback(PlayerCallback callback);
    
    interface PlayerCallback {
        void onPlaybackStarted();
        void onPlaybackCompleted();
    }
}