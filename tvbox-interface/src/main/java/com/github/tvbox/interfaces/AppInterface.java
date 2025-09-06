package com.github.tvbox.interfaces;

import android.content.Context;

public interface AppInterface {
    Context getAppContext();
    boolean isDebugMode();
    String getVersionName();
}