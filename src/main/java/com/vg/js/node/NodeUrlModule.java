package com.vg.js.node;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class NodeUrlModule {
    
    @Native
    public NodeUrl parse(String urlStr) {
        throw new RuntimeException("TODO url.parse");
    }

}
