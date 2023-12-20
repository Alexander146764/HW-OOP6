package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("ROBIN");
        Report report = new Report();
        report.report(user);
        Persister persister = new Persister();
        persister.save(user);
    }
}