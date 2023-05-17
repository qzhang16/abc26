package asg.dev.abc26.converter;

import asg.dev.abc26.jpaentities.User;
import asg.dev.abc26.webapi.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}