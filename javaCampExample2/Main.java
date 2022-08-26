package javaCampExample2;

public class Main {
    public static void main(String[] args) {
    UserManager[] userManagers = new UserManager[]{new StudentManager(), new InstructorManager()};


    for (UserManager userManager : userManagers){
        userManager.user("Added");
    }

    }
}
