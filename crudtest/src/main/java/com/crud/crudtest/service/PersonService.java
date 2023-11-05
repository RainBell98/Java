package com.crud.crudtest.service;


import com.crud.crudtest.domain.Person;
import com.crud.crudtest.domain.PersonEntity;
import com.crud.crudtest.dto.PersonDTO;
import com.crud.crudtest.mapper.PersonMapper;
import com.crud.crudtest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PersonRepository personRepository;

    public void insertPerson(PersonDTO personDTO) {
        PersonEntity person = new PersonEntity();

        person.setUser_id( personDTO.getUser_id() );
        person.setPassword( personDTO.getPassword() );
        person.setName( personDTO.getName() );

        personRepository.save(person);
//        personMapper.insertPerson(person);
    }
    //로그인
    public PersonDTO getPerson(PersonDTO personDTO) {
        Optional<PersonEntity> person =personRepository.findByUseridAndPassword(personDTO.getUser_id(),personDTO.getPassword());
//        Person person = personMapper.getPerson(personDTO.getUser_id(), personDTO.getPassword());

        PersonDTO data = new PersonDTO();
        data.setId( person.get().getId() );

        return data;
    }

    //회원정보 조회
    public PersonDTO getPersonData(long id) {
//        Person person = personMapper.getPersonData(id);
        Optional<PersonEntity> person = personRepository.findById(id);
        PersonDTO data = new PersonDTO();
        if(!person.isPresent()){
            System.out.println("XXXXXX");
        }else{
            data.setUser_id( person.get().getUserid() );
            data.setName( person.get().getName());
            data.setPassword( person.get().getPassword());
        }
        return data;
    }

    //회원정보 수정
    public  void updatePerson(PersonDTO personDTO) {

        Person person = new Person();

        person.setName( personDTO.getName() );
        person.setPassword( personDTO.getPassword() );
        person.setUser_id( personDTO.getUser_id() );

        personMapper.updatePerson(person);

    }


    //회원정보 삭제
    public  void deletePerson(PersonDTO personDTO) {
        personMapper.deletePerson(personDTO.getUser_id());
    }
}
