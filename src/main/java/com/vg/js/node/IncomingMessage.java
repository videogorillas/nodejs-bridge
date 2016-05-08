package com.vg.js.node;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class IncomingMessage {
    public int statusCode;
    public String statusMessage;
    
    //Only valid for request obtained from http.Server.
    public String url;

    @Native
    public void on(String event, Callback1<Object> cb) {
        throw new RuntimeException("TODO HttpResponse.on");
    }

    @Native
    public void setEncoding(String string) {
        throw new RuntimeException("TODO HttpResponse.setEncoding");
    }

}
