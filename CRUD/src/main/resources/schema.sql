create table person
(
    id bigint not null auto_increment,
    user_id varchar(255) not null ,
    name varchar(255) not null,
    pw varchar(255) not null,
    primary key(id)
);