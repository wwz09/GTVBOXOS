package com.github.tvbox.interfaces;

public interface CacheInterface {
    void save(String key, String value);
    String load(String key);
    void remove(String key);
}