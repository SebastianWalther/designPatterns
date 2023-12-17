package strukturmuster.proxy;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        var authService = new DatabaseAuthorizationProxy(new DatabaseServer());
        System.out.println(authService.getData());
        authService.login("Mike");
        System.out.println(authService.getData());
    }
}
