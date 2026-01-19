import service.*;

public class Main {


    public static void main(String[] args) {

        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        Service3 service3 = new Service3();
        Service4 service4 = new Service4();
        Service5 service5 = new Service5();

        service1.connectedDB();
        service2.connectedDB();
        service3.connectedDB();
        service4.connectedDB();
        service5.connectedDB();

    }

}
