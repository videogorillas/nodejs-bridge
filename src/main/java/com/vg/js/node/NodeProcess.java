package com.vg.js.node;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

import com.vg.js.node.Writable;

@STJSBridge
public class NodeProcess {
    public Array<String> argv;
    public Writable stdout;
    public Writable stderr;
    public int pid;

    @Native
    public void exit(int code) {
        throw new RuntimeException("TODO NodeProcess.exit");
    }

    @Native
    public void on(String string, Callback1<Object> cb) {
        throw new RuntimeException("TODO NodeProcess.on");
    }

    @Native
    public void kill(int pid, String signal) {
        throw new RuntimeException("TODO NodeProcess.kill");
    }

    @Native
    public void removeListener(String string, Callback1 sigintListener) {
        throw new RuntimeException("TODO NodeProcess.removeListener");
    }

}
