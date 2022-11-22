create table users
(
    id        bigserial not null
        constraint users_pk
            primary key,
    name      varchar,
    last_name varchar,
    phone     varchar,
    address   varchar,
    born      date
);

alter table users
    owner to postgres;

