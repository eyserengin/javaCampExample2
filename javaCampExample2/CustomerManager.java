package javaCampExample2;

public class CustomerManager {

    private UserManager userManager;

    public CustomerManager(UserManager userManager){
        this.userManager = userManager;
    }
    public void add(){
        userManager.user("Customer loged.");
    }
}
