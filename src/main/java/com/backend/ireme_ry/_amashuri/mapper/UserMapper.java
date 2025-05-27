package com.backend.ireme_ry._amashuri.mapper;

import com.backend.ireme_ry._amashuri.dto.UserDto;
import com.backend.ireme_ry._amashuri.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        UserDto dto = new UserDto();

        return dto;
    }
}
