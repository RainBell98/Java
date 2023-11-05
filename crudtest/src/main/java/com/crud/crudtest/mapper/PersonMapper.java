package com.crud.crudtest.mapper;


import com.crud.crudtest.domain.Person;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PersonMapper {

    //회원가입
    @Insert("INSERT INTO seoul (user_id, password, name) VALUES ( #{user_id}, #{password}, #{name} )")
    void insertPerson(Person person);


    //로그인
    @Select("SELECT * FROM seoul WHERE (user_id=#{user_id} and password=#{password}) ORDER BY id DESC LIMIT 1  ")
    Person getPerson(String user_id, String password);

    //사용자 정보 조회
    @Select("SELECT * FROM seoul WHERE id=#{id}")
    Person getPersonData(long id);

    //사용자 정보 수정
    @Update("UPDATE seoul SET password=#{password}, name=#{name} WHERE user_id=#{user_id} ")
    void updatePerson(Person peron);



}
