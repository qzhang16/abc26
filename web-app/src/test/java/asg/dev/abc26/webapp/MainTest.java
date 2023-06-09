package asg.dev.abc26.webapp;

import asg.dev.abc26.converter.UserMapper;
import asg.dev.abc26.jpaentities.User;
import asg.dev.abc26.webapi.ObjectFactory;
import asg.dev.abc26.webapi.UserCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void userCommandTest() {
        UserCommand userCommand = new ObjectFactory().createUserCommand();
        userCommand.setFirstName("Jack");
        User user01 = UserMapper.INSTANCE.userCommandToUser(userCommand);
        assertEquals("Jack",user01.getFirstName());
    }


}