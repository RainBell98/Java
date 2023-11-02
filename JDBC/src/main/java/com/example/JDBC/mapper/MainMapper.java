package com.example.JDBC.mapper;

import com.example.JDBC.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MainMapper {
    //mapper 참고하기
    List<Users> findAll();

    //mapper xml 참고 안하기
    @Insert("INSERT INTO users (name,address) values (#{name},#{address})")
    void insertUser(Users user);

}
