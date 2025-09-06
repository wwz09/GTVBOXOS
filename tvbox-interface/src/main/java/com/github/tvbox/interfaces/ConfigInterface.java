package com.github.tvbox.interfaces;

public interface ConfigInterface {
    String getApiUrl();
    void saveApiUrl(String url);
    String getDefaultUserAgent();
}