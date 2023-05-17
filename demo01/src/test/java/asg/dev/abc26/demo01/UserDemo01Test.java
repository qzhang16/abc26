package asg.dev.abc26.demo01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDemo01Test {
    static UserDemo01 userDemo01;
    @BeforeAll
    static void setup() {
        userDemo01 = new UserDemo01();
    }

    @Test
    void getNameTest() {
        System.out.println(userDemo01.firstName + " " + userDemo01.lastName);
        assertEquals("Jack", userDemo01.firstName);
        assertEquals("Ma", userDemo01.lastName);
    }


}