package com.github.tvbox.subtitle;

import com.github.tvbox.subtitle.model.Subtitle;

public interface SubtitleEngine {
    // 保留原有SubtitleEngine接口的所有方法定义
    void loadSubtitle(String url);
    void setOnSubtitleChangeListener(OnSubtitleChangeListener listener);
    // 其他方法...
}