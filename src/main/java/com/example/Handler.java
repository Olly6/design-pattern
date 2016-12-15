package com.example;

import lombok.Data;

import java.util.List;

/**
 * Created by akarui on 2016/12/14.
 */
public abstract class Handler {
    protected String handelName;
    protected Handler next;
    protected boolean isNeedNext;
    public abstract void check(List<String> targetList) ;

    public String getHandelName() {
        return handelName;
    }

    public void setHandelName(String handelName) {
        this.handelName = handelName;
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public boolean isNeedNext() {
        return isNeedNext;
    }

    public void setNeedNext(boolean needNext) {
        isNeedNext = needNext;
    }
}
