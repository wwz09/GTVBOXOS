package com.github.tvbox.interface;

public interface ConfigInterface {
    String getApiUrl();
    void saveApiUrl(String url);
    String getDefaultUserAgent();
}