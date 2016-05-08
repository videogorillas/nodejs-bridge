package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Error extends RuntimeException {

    public String name = "Error";
    public String message = "";
    public String stack;

    @Native
    public Error(String message) {
        super(message);
        this.message = message;
    }
}
