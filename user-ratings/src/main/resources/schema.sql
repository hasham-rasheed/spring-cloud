DROP TABLE IF EXISTS user_rating;
create table user_rating
(
    ID     INT auto_increment,
    NAME   VARCHAR not null,
    MOVIE_RATING   int not null,
    MOVIE_ID int not null
);

create unique index USER_RATING_ID_UINDEX
    on user_rating (ID);

create unique index USER_RATING_UINDEX
    on user_rating (NAME);

alter table user_rating
    add constraint USER_RATING_PK
        primary key (ID);