package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.typed.ArrayBuffer;

@STJSBridge
public class ClientRequest {

    @Native
    public void on(String string, Callback1<IncomingMessage> object) {
        throw new RuntimeException("TODO ClientRequest.on");
    }

    @Native
    public void end() {
        throw new RuntimeException("TODO ClientRequest.end");
    }

    @Native
    public void end(ArrayBuffer data) {
        throw new RuntimeException("TODO ClientRequest.end");
    }

    @Native
    public void end(String data, String encoding) {
        throw new RuntimeException("TODO ClientRequest.end");
    }

    @Native
    public void abort() {
        throw new RuntimeException("TODO ClientRequest.abort");
    }

}
