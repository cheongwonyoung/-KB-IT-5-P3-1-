package com.kb.crunchit.mapper.recommendation.top;

import com.kb.crunchit.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByEmail(String email);
    User findByNickname(String nickname);
    void insertUser(User dto);

    void updateUser(User user);
}
