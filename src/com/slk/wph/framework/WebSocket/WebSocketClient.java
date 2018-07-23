package com.slk.wph.framework.WebSocket;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

/**
 *
 * websocket-client
 * Create by song-xl on 2018-06-08 04:23:15
 */
@ClientEndpoint
public class WebSocketClient {

    private Session session;

    String uri = "ws://192.168.1.110:8080/websocket";
    @OnOpen
    public void onOpen(Session session) throws IOException {
        this.session = session;
    }

    @OnMessage
    public void onMessage(String message) {
    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }
    /**
     * 连接关闭调用的方法
     * @throws Exception
     */
    @OnClose
    public void onClose() throws Exception{
    }

    /**
     * 关闭链接方法
     * @throws IOException
     */
    public void closeSocket() throws IOException {
        this.session.close();
    }

    /**
     * 发送消息方法。
     * @param message
     * @throws IOException
     */
    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }
    //启动客户端并建立链接
    public void start() {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        try {
            this.session = container.connectToServer(WebSocketClient.class, URI.create(uri));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}