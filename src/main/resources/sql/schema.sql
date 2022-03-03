create table "Halls"
(
    id    serial
        constraint halls_pk
            primary key,
    seats int not null
);

create table "Films"
(
    id              serial
        constraint films_pk
            primary key,
    title           VARCHAR not null,
    release         int     not null,
    age_restriction int,
    description     TEXT
);