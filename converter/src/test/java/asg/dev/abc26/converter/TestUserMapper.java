package asg.dev.abc26.converter;

import asg.dev.abc26.jpaentities.User;
import asg.dev.abc26.webapi.ObjectFactory;
import asg.dev.abc26.webapi.UserCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserMapper {
    @Test
    void TestUserCommand2User() {
        UserCommand userCommand = new ObjectFactory().createUserCommand();
        userCommand.setFirstName("Jack");
        User user01 = UserMapper.INSTANCE.userCommandToUser(userCommand);
        Assertions.assertEquals("Jack",user01.getFirstName());

    }
}
