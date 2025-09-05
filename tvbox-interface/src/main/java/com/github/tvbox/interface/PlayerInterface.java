package com.github.tvbox.interface;

public interface PlayerInterface {
    void initialize();
    void playMedia(String url);
    void setCallback(PlayerCallback callback);
    
    interface PlayerCallback {
        void onPlaybackStarted();
        void onPlaybackCompleted();
    }
}