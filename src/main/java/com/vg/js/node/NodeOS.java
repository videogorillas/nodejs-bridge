package com.vg.js.node;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class NodeOS {
    public String arch() {
        return null;
    }

    public Array<Object> cpus() {
        return null;
    }

    public String endianness() {
        return null;
    }

    public long freemem() {
        return 0;
    }

    public String homedir() {
        return null;
    }

    public String hostname() {
        return null;
    }

    public Array<Double> loadavg() {
        return null;
    }

    public Map<String, Object> networkInterfaces() {
        return null;
    }

    public String platform() {
        return null;
    }

    public String release() {
        return null;
    }

    public String tmpdir() {
        return null;
    }

    public long totalmem() {
        return 0;
    }

    public String type() {
        return null;
    }

    public long uptime() {
        return 0;
    }

}
