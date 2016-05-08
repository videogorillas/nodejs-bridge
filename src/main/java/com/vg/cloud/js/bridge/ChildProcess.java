package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;

@STJSBridge
public class ChildProcess {

    public Readable stdout;
    public Readable stderr;
    public int pid;
    public Integer exitCode;

    @Native
    public void on(String string, Callback2<?, ?> object) {
        throw new RuntimeException();
    }

}
