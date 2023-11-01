package com.example.JDBC.mapper;

import com.example.JDBC.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MainMapper {
    //mapper 참고하기
    List<User> retrieveAll();

    //mapper xml 참고 안하기
    @Insert("INSERT INTO user (name,address) values (#{name},#{address})")
    void insertUser(User user);

}
