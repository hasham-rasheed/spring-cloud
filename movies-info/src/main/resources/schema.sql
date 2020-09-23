DROP TABLE IF EXISTS movie;
create table movie
(
    ID   INT auto_increment,
    NAME VARCHAR not null,
    DESC VARCHAR
);

create unique index MOVIE_ID_UINDEX
    on MOVIE (ID);

create unique index MOVIE_NAME_UINDEX
    on MOVIE (NAME);

alter table MOVIE
    add constraint MOVIE_PK
        primary key (ID);



