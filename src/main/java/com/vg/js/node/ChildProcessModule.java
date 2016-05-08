package com.vg.js.node;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class ChildProcessModule {

    public ChildProcess spawn(String cmd, Array<String> args, Map<String, ? extends Object> options) {
        throw new RuntimeException("TODO ChildProcess.spawn");
    }

}
