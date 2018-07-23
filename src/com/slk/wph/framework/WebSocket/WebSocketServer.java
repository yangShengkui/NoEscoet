package com.slk.wph.framework.WebSocket;

import com.slk.wph.framework.Cache.MemcachedUtil;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 * websocket-server
 *
 * founder:创建人
 * recipient:接收者
 *
 * Create by song-xl on 2018-06-08 04:23:50
 */
@ServerEndpoint(value = "/websocket/{founder}")
@Component
public class WebSocketServer {
    //当前在线连接数。
    private static int onlineCount = 0;
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<WebSocketServer>();

    private static Map<String, CopyOnWriteArraySet<WebSocketServer>> socketMap = new HashMap<String, CopyOnWriteArraySet<WebSocketServer>>();

    private static Logger logger = Logger.getLogger(WebSocketServer.class);

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(@PathParam(value = "founder")String founder,Session session ) {
        this.session = session;
        webSocketSet.add(this);
        socketMap.put(founder.split("&")[0],webSocketSet);
        addOnlineCount();           //在线数加1

        logger.info("有新连接加入！当前在线人数为" + getOnlineCount());
        try {
            sendMessage("连接成功");
        } catch (IOException e) {
            logger.error("websocket IO异常");
        }
    }


    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        logger.info("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
    @OnMessage
    public void onMessage(String message,@PathParam(value = "founder")String founder , Session session) {
        CopyOnWriteArraySet<WebSocketServer> webSocketServers = socketMap.get(founder.split("&")[1]);

            for (WebSocketServer item : webSocketServers) {
                try {
                    item.sendMessage(message);
                } catch (IOException e) {
                    System.out.println("socket异常");
                    continue;
                }
            }

        logger.info("来自客户端的消息:" + message);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
   /* @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println(session.getQueryString());
        if (!message.equals("异常检测")) {
            logger.info("来自客户端的消息:" + message);
            //群发消息
            for (WebSocketServer item : webSocketSet) {
                try {
                    item.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/



    /**
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        logger.error("发生错误");
        error.printStackTrace();
    }


    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    public static void main(String[] args) {
        logger.info("1");
    }

    /**
     * 群发自定义消息
     * */
    public static void sendInfo(String message) throws IOException {
        logger.info(message);
        for (WebSocketServer item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                continue;
            }
        }
    }


    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }
}
