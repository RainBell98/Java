//package com.example.JDBC;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserCommandRun implements CommandLineRunner {
//
//    @Autowired
//    private UserJdbcRepo user;
//    @Override
//    public void run(String... args) throws Exception {
//        user.insert(new Users(1,"홍길동","서울시 마포구"));
//        user.insert(new Users(2,"길동홍","서울시 용산구"));
//        user.insert(new Users(3,"동홍길","서울시 종로구"));
//
//        user.deleteId(1);
//
//        System.out.println(user.findId(2));
//    }
//}
