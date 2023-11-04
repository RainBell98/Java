package com.example.CRUD.mapper;

import com.example.CRUD.domain.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface MainMapper {
    List<Person> findAll();
    @Insert("INSERT INTO person (user_id,pw,name) VALUES (#{user_id},#{name},#{pw})")
    void insertPerson(Person person);

    @Select("SELECT * FROM person WHERE (user_id = #{user_id} and pw =#{pw})")
    Person getPerson(String user_id,String pw);

//    @Update("UPDATE person set = #{pw} where user_id =#{user_id} ")

}
