package strukturmuster.proxy;

public class DatabaseAuthorizationProxy extends DatabaseServer{

    boolean isAuthorized = false;
    DatabaseServer databaseServer;

    DatabaseAuthorizationProxy(DatabaseServer databaseServer){
        this.databaseServer=databaseServer;
    }

    @Override
    public String getData() {
        if(!isAuthorized){
            return "Du hast kein Zugriff!";
        }
            return super.getData();
    }

    public void login(String benuzer){
            isAuthorized = benuzer.equals("Mike");
    }
}
