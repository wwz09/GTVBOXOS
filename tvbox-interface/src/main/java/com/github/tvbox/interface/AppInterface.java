package com.github.tvbox.interface;

import android.content.Context;

public interface AppInterface {
    Context getAppContext();
    boolean isDebugMode();
    String getVersionName();
}