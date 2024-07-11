package homework;


public class UserServise {
    private final User user;

    public UserServise(User user) {
        this.user = user;
    }

    public void save(){
        Persister persister = new Persister(user);
        persister.save();
    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }

    
}