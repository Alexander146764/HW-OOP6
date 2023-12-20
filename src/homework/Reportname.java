package homework;

public class Reportname extends Report<User> {


    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
