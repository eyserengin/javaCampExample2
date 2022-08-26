package javaCampExample2;

public class StudentManager extends UserManager{
    String lessons;
    int note;

    public void user(String message){
        System.out.println("User Student: " + message);
    }
}
