package example.server.service;

import example.server.entity.People;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {
    @WebMethod
    public String sayHello(People people);
}
