package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public interface Writable {
    public void write(Object chunk, String encoding, Object callback);

    public void write(Object data);
}
