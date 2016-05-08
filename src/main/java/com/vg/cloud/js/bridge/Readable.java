package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public interface Readable {
    public void on(String event, Callback1<Object> cb);
}
