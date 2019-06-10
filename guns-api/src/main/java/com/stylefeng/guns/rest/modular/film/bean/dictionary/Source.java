package com.stylefeng.guns.rest.modular.film.bean.dictionary;

import java.io.Serializable;

/**
 * @author czy
 * @date 2019/6/5 9:45
 */
public class Source implements Serializable {
    private int sourceId;
    private String sourceName;
    private boolean isActive;

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Source{" +
                "sourceId=" + sourceId +
                ", sourceName='" + sourceName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
