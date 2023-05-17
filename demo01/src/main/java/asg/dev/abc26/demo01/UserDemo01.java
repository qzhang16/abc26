package asg.dev.abc26.demo01;
import asg.dev.abc26.jpaentities.User;

public class UserDemo01 {
    public String firstName = "Jack";
    public String lastName = "Ma";
    public String email = "jack.ma@aliyun.com";
    public long id =1L;
    public static void main(String[] args) {
        User userDemo01 = new User();
        userDemo01.setFirstName("Jack");
        userDemo01.setLastName("Ma");

        System.out.println(userDemo01.getFirstName() + " " + userDemo01.getLastName());

    }


}
