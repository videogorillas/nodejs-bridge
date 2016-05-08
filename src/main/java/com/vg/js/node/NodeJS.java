package com.vg.js.node;

import org.stjs.javascript.Console;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
@GlobalScope
public class NodeJS {
    public static Console console;
    public static NodeProcess process;
    public static NodeUrlModule url;
    public static FS fs;
    public static Map<String, Object> GLOBAL;

    @Native
    public static <T> T require(String str) {
        if (str == "fs") {
            return (T) new FS();
        }
        return null;
    }
}
