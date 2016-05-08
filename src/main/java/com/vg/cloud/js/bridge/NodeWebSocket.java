package com.vg.cloud.js.bridge;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.websocket.WebSocket;

@STJSBridge
public class NodeWebSocket {
    public Class<WebSocketClient> client;
    public Class<WebSocket> w3cwebsocket;
}
