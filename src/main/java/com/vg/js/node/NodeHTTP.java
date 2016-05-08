package com.vg.js.node;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class NodeHTTP {
    @Native
    public ClientRequest request(Map<String, Object> options, Callback1<IncomingMessage> cb) {
        return null;
    }

    @Native
    public ClientRequest request(String url, Callback1<IncomingMessage> cb) {
        return null;
    }

}
