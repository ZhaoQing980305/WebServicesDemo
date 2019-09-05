package example.server.service.impl;

import example.server.entity.People;
import example.server.service.IHelloWorld;

import javax.jws.WebService;

@WebService
public class IHelloWorldImpl implements IHelloWorld {
    @Override
    public String sayHello(People people) {
        System.out.print("hello:" + people.getName() + "年龄：" + people.getAge());
        return "200";
    }
}
