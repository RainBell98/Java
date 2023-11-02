package com.example.CRUD.service;

import com.example.CRUD.domain.Person;
import com.example.CRUD.dto.PersonDTO;
import com.example.CRUD.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private MainMapper mainMapper;

    public void insertPerson(PersonDTO personDTO) {
        Person person = new Person();
        person.setUser_id(personDTO.getUser_id());
        person.setName(personDTO.getName());
        person.setPw(personDTO.getPw());

        mainMapper.insertPerson(person);
    }

    public boolean getPerson(PersonDTO personDTO){
      Person person = mainMapper.getPerson(personDTO.getUser_id(), personDTO.getPw());
      if(person == null){
          return false;
      }else{
          return true;
      }

    }
}
