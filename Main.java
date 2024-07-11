package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserServise servise = new UserServise(user);
       
        servise.report();
        servise.save();
    }
}