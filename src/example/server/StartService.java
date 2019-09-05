package example.server;

import example.server.service.impl.IHelloWorldImpl;

import javax.xml.ws.Endpoint;

public class StartService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/HelloWorld", new IHelloWorldImpl());
        System.out.println("服务端启动成功...");
    }
}
