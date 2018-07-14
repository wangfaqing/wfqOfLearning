package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemonEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemonEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
