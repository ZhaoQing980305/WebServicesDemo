package example.server;

public class StartClient {
    public static void main(String[] args) {
        IHelloWorldImplService service = new IHelloWorldImplService();
        IHelloWorldImpl helloService = service.getIHelloWorldImplPort();
        People people = new People();
        people.setAge(22);
        people.setName("宫本");
        helloService.sayHello(people);
        System.out.println("客户端启动成功。。。");
    }
}

