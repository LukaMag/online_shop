create table categories
(
    id             bigserial not null
        constraint categories_pk
            primary key,
    category       varchar   not null,
    category_desc varchar
);

alter table categories
    owner to postgres;
