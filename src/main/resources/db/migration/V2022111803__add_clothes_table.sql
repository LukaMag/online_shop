create table clothes
(
    id          bigserial not null
        constraint clothes_pk
            primary key,
    name        varchar   not null,
    size        varchar,
    color       varchar,
    category_id bigserial not null
        constraint clothes___fk_category_id
            references categories
            on update cascade on delete cascade,
    sex         varchar,
    price       double precision,
    release     date,
    supplier_id bigserial not null
        constraint clothes___fk_supplier_id
            references suppliers
            on update cascade on delete cascade
);

alter table clothes
    owner to postgres;